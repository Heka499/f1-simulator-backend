package com.example.f1simulator.model;

import java.util.ArrayList;
import java.util.Map;


public class Championship {
    private int year;
    private ArrayList<Driver> drivers;
    private ArrayList<Team> teams;
    private Map<Driver, Double> driverStandings;
    private Map<Team, Double> teamStandings;
    private ArrayList<Race> races;

    // Constructor
    public Championship(int year, ArrayList<Driver> drivers, ArrayList<Team> teams, ArrayList<Race> races) {
        this.year = year;
        this.drivers = drivers;
        this.teams = teams;
        this.driverStandings = new java.util.HashMap<>();
        this.teamStandings = new java.util.HashMap<>();
        this.races = races;
        initializeStandings();
    }

    private void initializeStandings() {
        for (Driver driver : drivers) {
            driverStandings.put(driver, 0.0);
        }
        for (Team team : teams) {
            teamStandings.put(team, 0.0);
        }
    }

    // Getters
    public int getYear() {
        return year;
    }

    public ArrayList<Driver> getDrivers() {
        return drivers;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public Map<Driver, Double> getDriverStandings() {
        return driverStandings;
    }

    public Map<Team, Double> getTeamStandings() {
        return teamStandings;
    }

    // Setters
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Championship Year: ").append(year).append("\n");
        sb.append("Drivers:\n");
        for (Driver driver : drivers) {
            sb.append("- ").append(driver.getName()).append(" (Number: ").append(driver.getNumber()).append(")\n");
        }
        sb.append("Teams:\n");
        for (Team team : teams) {
            sb.append(team.toString()).append("\n");
        }
        return sb.toString();
    }
}
