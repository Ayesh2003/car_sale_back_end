package org.example.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CarEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long carId;
    private String brand;
    private String carNumber;
    private int passengerCount;
    private String gearSystem;
    private String model;
    private String madeYear;
    private String colour;
    private String fuelEfficient;
}
