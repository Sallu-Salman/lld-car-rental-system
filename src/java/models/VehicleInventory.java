package java.models;

import java.constants.VehicleStatus;
import java.util.ArrayList;
import java.util.List;

public class VehicleInventory {
    private final List<Vehicle> vehicles;

    public VehicleInventory() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void parkVehicle(Vehicle vehicle) {
        vehicle.setStatus(VehicleStatus.AVAILABLE);
    }

    public Vehicle getVehicle() {
        Vehicle vehicle = vehicles
                .stream()
                .filter(v -> v.getStatus() == VehicleStatus.AVAILABLE)
                .findAny()
                .orElse(null);
        if(vehicle != null) {
            vehicle.setStatus(VehicleStatus.RESERVED);
        }
        return vehicle;
    }

    // TODO: get a vehicle based on vehicle number or any specification
}
