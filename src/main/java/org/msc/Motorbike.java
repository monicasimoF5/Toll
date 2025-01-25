package org.msc;

public class Motorbike extends Vehicle{
    public Motorbike(String tuition) {
        super(tuition);
    }

    public Motorbike() {

    }

    @Override
    public double calculateToll(){
        return 50;
    }
}
