package com.example.f1simulator.controller;

import com.example.f1simulator.service.ChampionshipSimulationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SimulationController {

    private final ChampionshipSimulationService championshipSimulationService = new ChampionshipSimulationService();

    @GetMapping("/simulate")
    public String simulateChampionship() {
        int numberOfRaces = 5; // You can change this to simulate more or fewer
        championshipSimulationService.simulateChampionship(numberOfRaces);
        return "Championship simulation completed. Check the console for results.";
    }
}
