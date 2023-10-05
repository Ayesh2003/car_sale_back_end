package org.example.repository;

import org.example.dao.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends JpaRepository<CarEntity,Long> {


}
