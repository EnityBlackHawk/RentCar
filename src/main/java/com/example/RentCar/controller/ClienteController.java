package com.example.RentCar.controller;

import com.example.RentCar.model.Cliente;
import com.example.RentCar.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/cliente")
public class ClienteController {

    private ClienteService service;

    public ClienteController(@Autowired ClienteService service) {
        this.service = service;
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Cliente>> getAll()
    {
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping("/insert")
    public ResponseEntity<Cliente> insert(@RequestBody Cliente cliente)
    {
        return ResponseEntity.ok(service.insert(cliente));
    }


}
