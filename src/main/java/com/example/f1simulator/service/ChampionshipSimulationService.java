package com.example.f1simulator.service;

import com.example.f1simulator.model.Driver;
import com.example.f1simulator.model.DriverStats;

import java.util.*;

public class ChampionshipSimulationService {

    private final RaceSimulationService raceSimulationService = new RaceSimulationService();
    private final Map<Driver, DriverStats> championshipStandings = new HashMap<>();
    private final Map<String, Integer> teamStandings = new HashMap<>();
    private final int[] pointsSystem = {25, 18, 15, 12, 10, 8, 6, 4, 2, 1}; // Points for top 10 finishes

    public void simulateChampionship(int numberOfRaces) {
        for (int race = 1; race <= numberOfRaces; race++) {
            System.out.println("Race " + race + " Results:");
            List<RaceSimulationService.CarDriverPair> raceResults = raceSimulationService.simulateRace();

            for (int i = 0; i < raceResults.size(); i++) {
                System.out.println((i + 1) + ". " + raceResults.get(i));
            }

            for (int i = 0; i < raceResults.size() && i < pointsSystem.length; i++) {
                RaceSimulationService.CarDriverPair pair = raceResults.get(i);
                Driver driver = pair.getDriver();
                String teamName = pair.getCar().getTeamName();

                // Update driver standings
                championshipStandings.putIfAbsent(driver, new DriverStats());
                DriverStats stats = championshipStandings.get(driver);
                stats.setDriverName(driver.getName());
                stats.addResult(i + 1); // i + 1 because positions are 1

                // Update team standings
                teamStandings.put(teamName, teamStandings.getOrDefault(teamName, 0) + pointsSystem[i]);
            }


            System.out.println("\nChampionship Standings After Race " + race + ":");
            championshipStandings.entrySet().stream()
                    .sorted((a, b) -> Double.compare(b.getValue().getPoints(), a.getValue().getPoints()))
                    .forEach(entry -> System.out.println(entry.getKey().getName() + ": " + entry.getValue() + " points"));

            System.out.println("\nTeam Standings After Race " + race + ":");
            teamStandings.entrySet().stream()
                    .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                            .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue() + " points"));
            System.out.println();
        }
    }
}
