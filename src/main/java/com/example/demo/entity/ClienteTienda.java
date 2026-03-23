package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "clientes_tiendas")
public class ClienteTienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre_comercial;
    private String rfc_tax_id;
    private String ciudad;

    // Getters y Setters (los necesitamos para que Spring pueda leer los datos)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre_comercial() { return nombre_comercial; }
    public void setNombre_comercial(String nombre_comercial) { this.nombre_comercial = nombre_comercial; }
    public String getRfc_tax_id() { return rfc_tax_id; }
    public void setRfc_tax_id(String rfc_tax_id) { this.rfc_tax_id = rfc_tax_id; }
    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }
}