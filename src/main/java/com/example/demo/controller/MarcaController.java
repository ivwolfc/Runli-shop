package com.example.demo.controller;

import com.example.demo.entity.Marca;
import com.example.demo.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/marcas")
public class MarcaController {

    @Autowired
    private MarcaRepository repository;

    @PostMapping
    public Marca guardar(@RequestBody Marca marca) {
        return repository.save(marca);
    }
}