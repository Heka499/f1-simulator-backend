package com.example.f1simulator.controller;

import com.example.f1simulator.model.Championship;
import com.example.f1simulator.model.Driver;
import com.example.f1simulator.model.Team;
import com.example.f1simulator.service.ChampionshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ChampionshipController {

    @Autowired
    private ChampionshipService championshipService;

    @PostMapping("/championship/create")
    public String createChampionship(@RequestParam int year) {
        Championship championship = championshipService.createChampionship(year);
        return "Championship for the year " + year + " created successfully. \n Drivers: " +
                championship.getDrivers()
                .stream()
                .map(Driver::getName)
                .reduce((first, second) -> first + ", " + second)
                .orElse("No drivers available") +
                " \n Teams: " +
                championship.getTeams()
                .stream()
                .map(Team::getTeamName)
                .reduce((first, second) -> first + ", " + second)
                .orElse("No teams available") + ".";
    }

    @PostMapping("/championship/{year}/next")
    public String nextRace(@PathVariable int year) {
        Championship championship = championshipService.getChampionship(year);
        if (championship == null) {
            return "Championship for the year " + year + " does not exist.";
        }
        return championshipService.simulateNextRace(championship.getYear());
    }

    @GetMapping("/championship/{year}/standings")
    public String getStandings(@PathVariable int year) {
        Championship championship = championshipService.getChampionship(year);
        if (championship == null) {
            return "Championship for the year " + year + " does not exist.";
        }

        return "Driver Standings: \n" +
                championship.getDriverStandings()
                .entrySet()
                .stream()
                        .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
                .map(entry -> entry.getKey().getName() + ": " + entry.getValue())
                .reduce((first, second) -> first + "\n" + second)
                .orElse("No driver standings available") +
                "\n\nTeam Standings: \n" +
                championship.getTeamStandings()
                .entrySet()
                .stream()
                .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
                .map(entry -> entry.getKey().getTeamName() + ": " + entry.getValue())
                .reduce((first, second) -> first + "\n" + second)
                .orElse("No team standings available");
    }
}
