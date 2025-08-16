package com.example.f1simulator.model;

import java.util.ArrayList;

public class Team {
    private String teamName;
    private ArrayList<Driver> drivers;
    private Car car;

    // Constructor
    public Team(String teamName, Car car) {
        this.teamName = teamName;
        this.car = car;
        this.drivers = new ArrayList<>();
    }

    // Getters
    public String getTeamName() {
        return teamName;
    }

    public ArrayList<Driver> getDrivers() {
        return drivers;
    }

    public Car getCar() {
        return car;
    }

    // Setters
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void addDriver(Driver driver) {
        this.drivers.add(driver);
    }

    public void removeDriver(Driver driver) {
        this.drivers.remove(driver);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Team: ").append(teamName).append("\n");
        sb.append("Car: ").append(car.toString()).append("\n");
        sb.append("Drivers:\n");
        for (Driver driver : drivers) {
            sb.append("- ").append(driver.getName()).append(" (Number: ").append(driver.getNumber()).append(")\n");
        }
        return sb.toString();
    }
}
