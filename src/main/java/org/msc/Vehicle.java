package org.msc;

public abstract class Vehicle {
    private String tuition;

    public Vehicle(String tuition) {
        this.tuition = tuition;
    }

    public Vehicle() {
    }

    public String getTuition() {
        return tuition;
    }

    public void setTuition(String tuition) {
        this.tuition = tuition;
    }

    public abstract double calculateToll();
}
