package com.example.f1simulator.model;

public class Car {
    private String carName;
    private double speed;
    private double reliability;
    private double handling;

    // Constructor
    public Car(String carName, double speed, double reliability, double handling) {
        this.carName = carName;
        this.speed = speed;
        this.reliability = reliability;
        this.handling = handling;
    }

    // Getters
    public String getCarName() {
        return carName;
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
    public void setCarName(String carName) {
        this.carName = carName;
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
                "carName='" + carName + '\'' +
                ", speed=" + speed +
                ", reliability=" + reliability +
                ", handling=" + handling +
                '}';
    }
}
