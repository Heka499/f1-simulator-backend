package com.example.f1simulator.model;

public class Race {
    private String name;
    private String location;
    private int laps;
    private double length; // in kilometers

    // Constructor
    public Race(String name, String location, int laps, double length) {
        this.name = name;
        this.location = location;
        this.laps = laps;
        this.length = length;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getLaps() {
        return laps;
    }

    public double getLength() {
        return length;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setLaps(int laps) {
        this.laps = laps;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
