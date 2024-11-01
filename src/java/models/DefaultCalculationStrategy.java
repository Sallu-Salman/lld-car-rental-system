package java.models;

import java.time.Duration;

public class DefaultCalculationStrategy implements CalculationStrategy{
    @Override
    public double calculateCost(Reservation reservation) {
        return Duration.between(reservation.getStartTimeStamp(), reservation.getEndTimeStamp()).toHours()
                * reservation.getVehicle().getRate();
    }
}
