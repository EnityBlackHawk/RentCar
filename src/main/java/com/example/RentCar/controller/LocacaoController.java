package com.example.RentCar.controller;

import com.example.RentCar.DTO.LocacaoDTO;
import com.example.RentCar.model.Locacao;
import com.example.RentCar.service.LocacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/locacao")
public class LocacaoController {

    private LocacaoService service;

    public LocacaoController(@Autowired LocacaoService service) {
        this.service = service;
    }

    @PostMapping("/insert")
    public ResponseEntity<Locacao> insert(@RequestBody Locacao locacao)
    {
        return ResponseEntity.ok(service.insert(locacao));
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Locacao>> getAll()
    {
        return ResponseEntity.ok(service.getall());
    }

    @GetMapping("/get-by-client-id/{id}")
    public ResponseEntity<List<Locacao>> getByClienteId(@PathVariable String id)
    {
        return  ResponseEntity.ok(service.findByClienteId(Integer.parseInt(id)));
    }
}
