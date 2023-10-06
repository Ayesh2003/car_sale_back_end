package org.example.repository;

import org.example.dao.CarEntity;
import org.example.dao.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity,Long> {
}
