package com.example.f1simulator.service;

import com.example.f1simulator.model.Car;
import com.example.f1simulator.model.Driver;
import com.example.f1simulator.model.Championship;
import com.example.f1simulator.model.Race;
import com.example.f1simulator.model.Team;

import java.util.*;

public class RaceSimulationService {

    public static class RaceResult {
        private final List<Driver> driverResults;
        private final Map<Driver, Integer> driverPositions;

        public RaceResult(List<Driver> driverResults, Map<Driver, Integer> driverPositions) {
            this.driverResults = driverResults;
            this.driverPositions = driverPositions;
        }

        public List<Driver> getDriverResults() {
            return driverResults;
        }

        public Map<Driver, Integer> getDriverPositions() {
            return driverPositions;
        }
    }

    public RaceResult simulateRace(Championship championship, Race race) {
        List<Driver> drivers = championship.getDrivers();
        Map<Driver, Double> performanceScores = new HashMap<>();

        for (Driver driver: drivers) {
            Team team = championship.getTeams().stream()
                    .filter(t -> t.getDrivers().contains(driver))
                    .findFirst()
                    .orElse(null);

            if (team != null) {
                Car car = team.getCar();
                double score = car.getSpeed()
                        + car.getHandling() * 0.5
                        + driver.getSkill() * driver.getConsistency()
                        + Math.random() * 10; // Random factor for unpredictability
                performanceScores.put(driver, score);
            }
        }

        List<Driver> raceResults = new ArrayList<>(performanceScores.keySet());
        raceResults.sort((a, b) -> Double.compare(performanceScores.get(b), performanceScores.get(a)));

        Map<Driver, Integer> driverPositions = new HashMap<>();
        for (int i = 0; i < raceResults.size(); i++) {
            driverPositions.put(raceResults.get(i), i + 1); // Positions start from 1
        }

        return new RaceResult(raceResults, driverPositions);
    }
}
