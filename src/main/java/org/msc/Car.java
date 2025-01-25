package org.msc;

public class Car extends Vehicle{
    public Car(String plate) {
        super(plate);
    }

    public Car() {

    }

    @Override
    public double calculateToll(){
        return 100;
    }
}
