package java.models;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.constants.BillStatus;

@RequiredArgsConstructor
@Getter
public class Bill {
    private int id;
    @NonNull
    private Reservation reservation;
    @NonNull
    private double cost;
    @Setter
    private BillStatus status = BillStatus.UNPAID;
}
