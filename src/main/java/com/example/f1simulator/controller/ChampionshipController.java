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

    @PostMapping("/championship/{id}/next")
    public String nextRace() {
        // This method can be used to proceed to the race of the championship
        // For now, it just returns a confirmation message
        return "Proceeding to the next race of the championship.";
    }

    @GetMapping("/championship/{id}/standings")
    public String getStandings() {
        // This method can be used to retrieve the current standings of the championship
        // For now, it just returns a placeholder message
        return "Current championship standings retrieved successfully.";
    }
}
