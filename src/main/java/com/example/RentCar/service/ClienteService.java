package com.example.RentCar.service;

import com.example.RentCar.model.Cliente;
import com.example.RentCar.repository.ClienteRepository;
import org.aspectj.apache.bcel.generic.InstructionConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private ClienteRepository repository;

    public ClienteService(@Autowired ClienteRepository repository) {
        this.repository = repository;
    }

    public Cliente insert(Cliente cliente)
    {
        return repository.save(cliente);
    }

    public List<Cliente> findAll()
    {
        return repository.findAll();
    }

    public Cliente getById(int id) {
        return repository.findById(id).orElse(null);
    }

}
