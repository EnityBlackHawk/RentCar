package com.example.RentCar.controller;

import com.example.RentCar.model.Carro;
import com.example.RentCar.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carro")
public class CarroController {

    private CarroService service;

    public CarroController(@Autowired CarroService service) {
        this.service = service;
    }

    @PostMapping("/insert")
    public ResponseEntity<Carro> insert(@RequestBody Carro carro)
    {
        return ResponseEntity.ok(service.insert(carro));
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Carro>> getAll()
    {
        return ResponseEntity.ok(service.findAll());
    }
}
