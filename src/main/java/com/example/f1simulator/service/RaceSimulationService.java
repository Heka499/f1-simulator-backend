package com.example.f1simulator.service;

import com.example.f1simulator.model.Car;
import com.example.f1simulator.model.Driver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RaceSimulationService {

    public static class CarDriverPair {
        private Car car;
        private Driver driver;

        public CarDriverPair(Car car, Driver driver) {
            this.car = car;
            this.driver = driver;
        }

        public Car getCar() {
            return car;
        }

        public Driver getDriver() {
            return driver;
        }

        @Override
        public String toString() {
            return driver.getName() + " (" + car.getTeamName() + ")";
        }
    }

    public List<CarDriverPair> simulateRace() {

        List<CarDriverPair> startingGrid = new ArrayList<>();

        startingGrid.add(new CarDriverPair(
                new Car("Red Bull", 95.0, 90.0, 85.0),
                new Driver("Max Verstappen", 1, 98.0, 95.0)
        ));

        startingGrid.add(new CarDriverPair(
                new Car("McLaren", 99.0, 90.0, 95.0),
                new Driver("Oscar Piastri", 81, 90.0, 93.0)
        ));

        startingGrid.add(new CarDriverPair(
                new Car("Mercedes", 93.0, 80.0, 90.0),
                new Driver("George Russel", 63, 94.0, 94.0)
        ));

        startingGrid.add(new CarDriverPair(
                new Car("Ferrari", 90.0, 90.0, 88.0),
                new Driver("Charles Leclerc", 16, 95.0, 94.0)
        ));

        Map<CarDriverPair, Double> performanceScores = new HashMap<>();
        for (CarDriverPair pair : startingGrid) {
            double score = pair.getCar().getSpeed()
                    + pair.getCar().getHandling() * 0.5
                    + pair.getDriver().getSkill()
                    * pair.getDriver().getConsistency()
                    + Math.random() * 10;
            performanceScores.put(pair, score);
        }

        List<CarDriverPair> raceResult = new ArrayList<>(performanceScores.keySet());
        raceResult.sort((a, b) -> Double.compare(performanceScores.get(b), performanceScores.get(a)));

        return raceResult;
    }
}
