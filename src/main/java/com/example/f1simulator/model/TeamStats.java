package com.example.f1simulator.model;

public class TeamStats {
    private String teamName;
    private double points;
    private int wins;
    private int podiums;
    private final int[] pointsSystem = {25, 18, 15, 12, 10, 8, 6, 4, 2, 1}; // Points for positions 1-10

    public void addResult(int position1, int position2) {
        if (position1 <= pointsSystem.length) {
            points += pointsSystem[position1 - 1];
        }
        if (position2 <= pointsSystem.length) {
            points += pointsSystem[position2 - 1];
        }

        if (position1 == 1 || position2 == 1) {
            wins++;
        }

        if (position1 <= 3 || position2 <= 3) {
            podiums++;
        }
    }

    @Override
    public String toString() {
        return "TeamStats{" +
                "teamName='" + teamName + '\'' +
                ", points=" + points +
                ", wins=" + wins +
                ", podiums=" + podiums +
                '}';
    }
}
