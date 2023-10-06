package org.example.controller;

import org.example.dao.CarEntity;
import org.example.dto.Car;
import org.example.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/car")
public class CarController {
    @Autowired
    CarService service;

    @PostMapping
    public void addCar(@RequestBody Car car){
        service.addCar(car);
    }

    @GetMapping
    public Iterable<CarEntity> getCars(){
       return service.getCars();
    }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable Long id){
        service.delete(id);
    }

    @GetMapping("/{id}")
    public Optional<CarEntity> searchCar(@PathVariable Long id){
        return service.searchCar(id);
    }

}



