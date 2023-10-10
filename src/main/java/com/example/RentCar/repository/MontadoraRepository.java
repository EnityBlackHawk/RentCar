package com.example.RentCar.repository;

import com.example.RentCar.model.Montadora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MontadoraRepository extends JpaRepository<Montadora, Integer>{
}
