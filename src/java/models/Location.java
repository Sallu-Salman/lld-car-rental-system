package java.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Location {
    private String city;
    private String state;
    private String country;
}
