package com.example.f1simulator.model;

import java.util.Objects;

public class Driver {
    private String name;
    private int number;
    private double skill;
    private double consistency;

    // Constructor
    public Driver(String name, int number, double skill, double consistency) {
        this.name = name;
        this.number = number;
        this.skill = skill;
        this.consistency = consistency;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int getNumber() {
        return this.number;
    }

    public double getSkill() {
        return this.skill;
    }

    public double getConsistency() {
        return this.consistency;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSkill(double skill) {
        this.skill = skill;
    }

    public void setConsistency(double consistency) {
        this.consistency = consistency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return number == driver.number && Objects.equals(name, driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }


    // toString method
    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", skill=" + skill +
                ", consistency=" + consistency +
                '}';
    }
}
