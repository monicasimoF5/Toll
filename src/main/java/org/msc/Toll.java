package org.msc;

import java.util.ArrayList;
import java.util.List;

public class Toll {
    private String name;
    private String city;
    private double totalRaised;
    private List<Vehicle> vehicles = new ArrayList<>();

    public Toll() {
    }

    public Toll(String name, String city, double totalRaised, List<Vehicle> vehicles) {
        this.name = name;
        this.city = city;
        this.totalRaised = totalRaised;
        this.vehicles = vehicles;
    }

    public Toll(String peajeCentral, String valencia) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getTotalRaised() {
        return totalRaised;
    }

    public void setTotalRaised(double totalRaised) {
        this.totalRaised = totalRaised;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void calculateToll(Vehicle vehicle) {
        double toll = vehicle.calculateToll();
        totalRaised += toll;
        vehicles.add(vehicle);
    }

    public void printList(){
        System.out.println("List of vehicles and total collected:");

        for (Vehicle vehicle : vehicles){
            System.out.println("Tuition: " + vehicle.getTuition() + ", Type: " + vehicle.getClass().getSimpleName() + ", Toll: " + vehicle.calculateToll() + "€.");
        }

        System.out.println("Total raised: " + totalRaised + "€.");
    }
}
