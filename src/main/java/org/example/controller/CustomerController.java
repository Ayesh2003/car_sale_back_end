package org.example.controller;

import org.example.dao.CarEntity;
import org.example.dao.CustomerEntity;
import org.example.dto.Car;
import org.example.dto.Customer;
import org.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService service;

    @PostMapping
    public void addCustomer(@RequestBody Customer customer){
        service.addCustomer(new Customer());
    }

    @GetMapping
    public Iterable<CustomerEntity> getCustomer(){
        return service.getCustomer();
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id){
        service.delete(id);
    }

    @GetMapping("/{id}")
    public Optional<CustomerEntity> searchCustomer(@PathVariable Long id){
        return service.searchCustomer(id);
    }

}





