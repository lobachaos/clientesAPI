package com.example.clientesAPI.models.repository;

import com.example.clientesAPI.models.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {

}
