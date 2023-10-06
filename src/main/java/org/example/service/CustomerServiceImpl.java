package org.example.service;

import org.example.dao.CarEntity;
import org.example.dao.CustomerEntity;
import org.example.dto.Car;
import org.example.dto.Customer;
import org.example.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void addCustomer(Customer customer) {
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setFirstName(customer.getFirstName());
        customerEntity.setLastName(customer.getLastName());
        customerEntity.setContact(customer.getContact());
        customerEntity.setNIC(customer.getNIC());
        customerEntity.setAddress(customer.getAddress());

        customerRepository.save(customerEntity);
    }

    @Override
    public Iterable<CustomerEntity> getCustomer() {
        return customerRepository.findAll();
    }



    @Override
    public void delete(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Optional<CustomerEntity> searchCustomer(Long id) {
        return customerRepository.findById(id);
    }
}