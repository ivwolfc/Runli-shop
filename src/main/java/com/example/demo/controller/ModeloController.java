package com.example.demo.controller;

import com.example.demo.entity.Modelo;
import com.example.demo.repository.ModeloRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/modelos")
@CrossOrigin(origins = "*")
public class ModeloController {

    private final ModeloRepository repository;

    public ModeloController(ModeloRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Modelo> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Modelo save(@RequestBody Modelo nuevo) {
        System.out.println(nuevo.getId());
        System.out.println(nuevo.getNombre());
        return repository.save(nuevo);
    }
}