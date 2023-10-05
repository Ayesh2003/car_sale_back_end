package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Car {
    private int carId;
    private String brand;
    private String carNumber;
    private int passengerCount;
    private String gearSystem;
    private String model;
    private String madeYear;
    private String colour;
    private String fuelEfficient;

}
