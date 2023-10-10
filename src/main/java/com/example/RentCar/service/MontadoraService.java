package com.example.RentCar.service;

import com.example.RentCar.model.Montadora;
import com.example.RentCar.repository.MontadoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MontadoraService {


    private MontadoraRepository repository;

    public MontadoraService(@Autowired MontadoraRepository repository)
    {
        this.repository = repository;
    }


    public Montadora insert(Montadora montadora)
    {
        return repository.save(montadora);
    }

    public List<Montadora> findAll()
    {
        return  repository.findAll();
    }

}
