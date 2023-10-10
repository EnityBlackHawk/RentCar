package com.example.RentCar.repository;

import com.example.RentCar.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Integer> {
}
