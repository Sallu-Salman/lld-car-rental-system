package java.models;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Store {
    @Getter
    private final Location location;
    @Getter
    private final VehicleInventory inventory;
    private CalculationStrategy calculationStrategy;

    public Store(Location location) {
        this.location = location;
        this.inventory = new VehicleInventory();
        this.calculationStrategy = new DefaultCalculationStrategy();
    }

    public void importVehicle(Vehicle vehicle) {
        inventory.addVehicle(vehicle);
    }

    public void updateCalculationStrategy(CalculationStrategy calculationStrategy) {
        this.calculationStrategy = calculationStrategy;
    }

    // TODO: include option for user to choose a vehicle by himself with vehicle number
    public Reservation reserveVehicle(User user) {
        Vehicle vehicle = inventory.getVehicle();
        return new Reservation(vehicle, user);
    }

    public Bill returnVehicle(Reservation reservation) {
        double cost = calculationStrategy.calculateCost(reservation);
        return new Bill(reservation, cost);
    }
}










