package com.example.AssingmentProject.data;

public class HealthDataset {
    private String health;

    public String getHealth() {
        return health;
    }
    public void setHealth(String health) {
        this.health = health;
    }

    public void setStatus(boolean value) {
        if (value) {
            this.health = "Healthy";
        } else {
            this.health = "Slowed";
        }
    }
}
