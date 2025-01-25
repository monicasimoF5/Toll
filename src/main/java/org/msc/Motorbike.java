package org.msc;

public class Motorbike extends Vehicle{
    public Motorbike(String plate) {
        super(plate);
    }

    public Motorbike() {

    }

    @Override
    public double calculateToll(){
        return 50;
    }
}
