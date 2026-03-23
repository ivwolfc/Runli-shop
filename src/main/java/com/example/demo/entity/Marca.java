package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "marcas")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre_marca;

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre_marca() { return nombre_marca; }
    public void setNombre_marca(String nombre_marca) { this.nombre_marca = nombre_marca; }
}