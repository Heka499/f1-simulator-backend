package com.example.f1simulator.model;

public class Race {
    private String name;
    private String circuit;
    private String location; // Location of the circuit
    private int laps;
    private double length; // in kilometers

    // Constructor
    public Race(String name, String circuit, String location, int laps, double length) {
        this.name = name;
        this.circuit = circuit;
        this.location = location;
        this.laps = laps;
        this.length = length;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCircuit() {
        return circuit;
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

    public void setCircuit(String circuit) {
        this.location = circuit;
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
