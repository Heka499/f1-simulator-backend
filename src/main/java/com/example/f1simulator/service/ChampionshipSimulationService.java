package com.example.f1simulator.service;

import com.example.f1simulator.model.Driver;

import java.util.*;

public class ChampionshipSimulationService {

    private final RaceSimulationService raceSimulationService = new RaceSimulationService();
    private final Map<Driver, Integer> championshipStandings = new HashMap<>();
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
                championshipStandings.put(driver, championshipStandings.getOrDefault(driver, 0) + pointsSystem[i]);

                // Update team standings
                teamStandings.put(teamName, teamStandings.getOrDefault(teamName, 0) + pointsSystem[i]);
            }


            System.out.println("\nChampionship Standings After Race " + race + ":");
            championshipStandings.entrySet().stream()
                    .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                    .forEach(entry -> System.out.println(entry.getKey().getName() + ": " + entry.getValue() + " points"));

            System.out.println("\nTeam Standings After Race " + race + ":");
            teamStandings.entrySet().stream()
                    .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                            .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue() + " points"));
            System.out.println();
        }
    }
}
