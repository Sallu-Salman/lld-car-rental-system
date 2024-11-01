package java.models;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Getter
public class Reservation {
    @NonNull
    private Vehicle vehicle;
    @NonNull
    private User user;
    private final LocalDateTime startTimeStamp = LocalDateTime.now();
    @Setter
    private LocalDateTime endTimeStamp;
}
