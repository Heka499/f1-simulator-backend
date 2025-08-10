package com.example.f1simulator.model;

public class DriverStats {
    private String driverName;
    private int racesParticipated;
    private double points;
    private int wins;
    private int podiums;
    private double averageFinishPosition;
    private double totalPositions;
    private final int[] pointsSystem = {25, 18, 15, 12, 10, 8, 6, 4, 2, 1}; // Points for positions 1-10

    public void addResult(int position) {
        racesParticipated++;
        totalPositions += position;
        averageFinishPosition = totalPositions / racesParticipated;

        if (position <= pointsSystem.length) {
            points += pointsSystem[position - 1];
        }

        if (position == 1) {
            wins++;
        }

        if (position <= 3) {
            podiums++;
        }
    }

    public int getWins() {
        return wins;
    }

    public int getPodiums() {
        return podiums;
    }

    public double getPoints() {
        return points;
    }

    public double getAverageFinishPosition() {
        return averageFinishPosition;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public String toString() {
        return "DriverStats{" +
                "driverName='" + driverName + '\'' +
                ", racesParticipated=" + racesParticipated +
                ", points=" + points +
                ", wins=" + wins +
                ", podiums=" + podiums +
                ", averageFinishPosition=" + averageFinishPosition +
                '}';
    }
}
