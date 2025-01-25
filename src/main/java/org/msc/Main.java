package org.msc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

        Toll toll = new Toll("Peaje Central", "Valencia");

        Car car1 = new Car("1234ABC");
        Motorbike motorbike1 = new Motorbike("5678XYZ");

        toll.calculateToll(car1);
        toll.calculateToll(motorbike1);

        toll.printList();
    }
}