package org.example.service;

import org.example.dao.CarEntity;
import org.example.dao.CustomerEntity;
import org.example.dto.Car;
import org.example.dto.Customer;

import java.util.Optional;

public interface CustomerService {
    void addCustomer(Customer customer);

    Iterable<CustomerEntity> getCustomer();

    void delete(Long id);

    Optional<CustomerEntity> searchCustomer(Long id);
}

