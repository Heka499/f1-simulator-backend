package com.example.f1simulator.model;

public class Car {
    private String teamName;
    private double speed;
    private double reliability;
    private double handling;

    // Constructor
    public Car(String teamName, double speed, double reliability, double handling) {
        this.teamName = teamName;
        this.speed = speed;
        this.reliability = reliability;
        this.handling = handling;
    }

    // Getters
    public String getTeamName() {
        return teamName;
    }

    public double getSpeed() {
        return speed;
    }

    public double getReliability() {
        return reliability;
    }

    public double getHandling() {
        return handling;
    }

    // Setters
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setReliability(double reliability) {
        this.reliability = reliability;
    }

    public void setHandling(double handling) {
        this.handling = handling;
    }

    // toString method
    @Override
    public String toString() {
        return "Car{" +
                "teamName='" + teamName + '\'' +
                ", speed=" + speed +
                ", reliability=" + reliability +
                ", handling=" + handling +
                '}';
    }
}
