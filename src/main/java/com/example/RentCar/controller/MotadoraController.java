package com.example.RentCar.controller;

import com.example.RentCar.model.Montadora;
import com.example.RentCar.service.MontadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/montadora")
public class MotadoraController {

    private MontadoraService service;

    public MotadoraController(@Autowired MontadoraService service) {
        this.service = service;
    }

    @GetMapping(value = "/get-all")
    public ResponseEntity<List<Montadora>> findAll()
    {
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping(value = "/insert")
    public ResponseEntity<Montadora> insert(@RequestBody Montadora montadora)
    {
        return ResponseEntity.ok(service.insert(montadora));
    }

}
