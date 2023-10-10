package com.example.RentCar.service;

import com.example.RentCar.DTO.LocacaoDTO;
import com.example.RentCar.model.Locacao;
import com.example.RentCar.repository.LocacaoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocacaoService {

    private LocacaoRepository repository;
    private ClienteService clienteService;

    public LocacaoService(@Autowired LocacaoRepository repository, @Autowired ClienteService clienteService) {
        this.repository = repository;
        this.clienteService = clienteService;
    }

    public Locacao insert(Locacao locacao)
    {
        return repository.save(locacao);
    }


    public List<Locacao> getall()
    {
        var list =  repository.findAll();

        return list;
    }

    public List<Locacao> findByClienteId(int id)
    {
        var client = clienteService.getById(id);
        return client != null ? repository.findByCliente(client) : null;
    }



}
