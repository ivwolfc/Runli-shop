package com.example.demo.controller;

import com.example.demo.entity.ClienteTienda;
import com.example.demo.repository.ClienteTiendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteTiendaController {

    @Autowired
    private ClienteTiendaRepository repository;

    @GetMapping
    public List<ClienteTienda> listar() {
        return repository.findAll();
    }

    @PostMapping
    public ClienteTienda guardar(@RequestBody ClienteTienda cliente) {
        return repository.save(cliente);
    }
}
