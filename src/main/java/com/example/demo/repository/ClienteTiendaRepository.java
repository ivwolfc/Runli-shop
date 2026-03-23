package com.example.demo.repository;

import com.example.demo.entity.ClienteTienda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteTiendaRepository extends JpaRepository<ClienteTienda, Long> {
}
