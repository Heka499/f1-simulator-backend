package com.example.f1simulator;

import com.example.f1simulator.model.Championship;
import com.example.f1simulator.service.ChampionshipService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChampionshipServiceTest {

    @Test
    void testCreateChampionship() {
        ChampionshipService championshipService = new ChampionshipService();

        int year = 2025;
        Championship championship = championshipService.createChampionship(year);

        assertNotNull(championship, "Championship should not be null");
        assertEquals(year, championship.getYear(), "Championship year should match the input year");
        assertNotNull(championship.getDrivers(), "Championship drivers list should not be null");
        assertNotNull(championship.getTeams(), "Championship teams list should not be null");
        assertFalse(championship.getDrivers().isEmpty(), "Championship drivers list should not be empty");
        assertFalse(championship.getTeams().isEmpty(), "Championship teams list should not be empty");
        assertNotNull(championship.getDriverStandings(), "Championship driver standings should not be null");
    }
}
