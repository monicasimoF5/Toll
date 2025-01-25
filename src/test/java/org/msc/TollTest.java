package org.msc;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TollTest {

    @Test
    void testCalculateTollForMultipleVehicles() {
        Toll toll = new Toll();
        Car car = new Car();
        Motorbike motorbike = new Motorbike();

        toll.calculateToll(car);
        toll.calculateToll(motorbike);

        assertEquals(150.0, toll.getTotalRaised());
    }

    @Test
    void testVehiclesListAfterCalculatingToll() {
        Toll toll = new Toll();
        Car car = new Car("ABC123");
        Motorbike motorbike = new Motorbike("XYZ789");

        toll.calculateToll(car);
        toll.calculateToll(motorbike);

        List vehicles = toll.getVehicles();
        assertEquals(2, vehicles.size());
        assertEquals(car, vehicles.get(0));
        assertEquals(motorbike, vehicles.get(1));
    }

    @Test
    void testTotalRaisedAfterMultipleTolls() {
        Toll toll = new Toll();
        Car car1 = new Car("CAR1");
        Car car2 = new Car("CAR2");
        Motorbike motorbike1 = new Motorbike("MOTO1");

        toll.calculateToll(car1);
        toll.calculateToll(car2);
        toll.calculateToll(motorbike1);

        assertEquals(250.0, toll.getTotalRaised()); // 100 + 100 + 50
    }

    @Test
    void testPrintList() throws IOException {
        Toll toll = new Toll();
        Car car = new Car("CAR1");
        Motorbike motorbike = new Motorbike("MOTO1");

        toll.calculateToll(car);
        toll.calculateToll(motorbike);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        toll.printList();

        String expectedOutput = "List of vehicles and total collected:\n" +
                "Tuition: CAR1, Type: Car, Toll: 100.0€.\n" +
                "Tuition: MOTO1, Type: Motorbike, Toll: 50.0€.\n" +
                "Total raised: 150.0€.\n";

        assertEquals(expectedOutput, outputStream.toString().replace("\r", ""));
        System.setOut(System.out);
    }

    @Test
    void testTollInitialization() {
        List vehicles = new ArrayList<>();
        Toll toll = new Toll("Peaje Central", "Valencia", 200.0, vehicles);

        assertEquals("Peaje Central", toll.getName());
        assertEquals("Valencia", toll.getCity());
        assertEquals(200.0, toll.getTotalRaised());
        assertTrue(toll.getVehicles().isEmpty());
    }
}