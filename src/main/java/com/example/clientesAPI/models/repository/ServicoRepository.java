package com.example.clientesAPI.models.repository;

import com.example.clientesAPI.models.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository <Servico,Integer> {

}
