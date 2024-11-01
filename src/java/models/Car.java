package java.models;

import java.constants.VehicleStatus;
import java.constants.VehicleType;

public class Car extends Vehicle{
    public Car(String vehicleNumber) {
        super(vehicleNumber, VehicleType.CAR, 100.0);
    }
}
