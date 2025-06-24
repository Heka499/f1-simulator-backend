package com.example.f1simulator.controller;

import com.example.f1simulator.service.RaceSimulationService;
import com.example.f1simulator.service.RaceSimulationService.CarDriverPair;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SimulationController {

    private final RaceSimulationService simulationService = new RaceSimulationService();

    @GetMapping("/simulate")
    public List<String> simulateRace() {
        List<CarDriverPair> results = simulationService.simulateRace();

        return results.stream()
                .map(pair -> pair.getDriver().getName() + " " + pair.getDriver().getNumber() + " (" + pair.getCar().getTeamName() + ")")
                .toList();
    }
}
