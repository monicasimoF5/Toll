package org.msc;

public class Car extends Vehicle{
    public Car(String tuition) {
        super(tuition);
    }

    public Car() {

    }

    @Override
    public double calculateToll(){
        return 100;
    }
}
