package org.example.service;

import org.example.dao.CarEntity;
import org.example.dto.Car;

import java.util.Optional;

public interface CarService {
    void addCar(Car car);

    Iterable<CarEntity> getCars();

    void delete(Long id);

    Optional<CarEntity> searchCar(Long id);
}
