package com.example.RentCar.service;

import com.example.RentCar.model.Carro;
import com.example.RentCar.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {

    private CarroRepository repository;

    public CarroService(@Autowired CarroRepository repository) {
        this.repository = repository;
    }

    public Carro insert(Carro carro)
    {
        return repository.save(carro);
    }

    public List<Carro> findAll()
    {
        return repository.findAll();
    }
}
