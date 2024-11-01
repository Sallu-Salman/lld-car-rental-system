package java.models;

import lombok.Getter;
import lombok.Setter;

import java.constants.VehicleStatus;
import java.constants.VehicleType;

public abstract class Vehicle {
    private int id;
    private String vehicleNumber;
    private VehicleType type;

    @Getter
    private double rate;

    @Setter
    @Getter
    private VehicleStatus status;

    private static int idGen = 1;

    public Vehicle(String vehicleNumber, VehicleType type, double rate) {
        this.id = idGen++;
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rate = rate;
        this.status = VehicleStatus.AVAILABLE;
    }
}
