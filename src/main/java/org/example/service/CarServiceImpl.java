package org.example.service;

import org.example.dao.CarEntity;
import org.example.dto.Car;
import org.example.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarServiceImpl implements CarService{
    @Autowired
    CarRepository repository;
    @Override
    public void addCar(Car car) {
       CarEntity carEntity = new CarEntity();
      carEntity.setBrand(car.getBrand());
       carEntity.setCarNumber(car.getCarNumber());
        carEntity.setPassengerCount(car.getPassengerCount());
       carEntity.setGearSystem(car.getGearSystem());
       carEntity.setModel(car.getModel());
     carEntity.setMadeYear(carEntity.getMadeYear());
       carEntity.setColour(carEntity.getColour());
        carEntity.setFuelEfficient(car.getFuelEfficient());

        repository.save(carEntity);

    }

    @Override
    public Iterable<CarEntity> getCars() {
        return repository.findAll();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<CarEntity> searchCar(Long id) {
         return repository.findById(id);
    }
}
