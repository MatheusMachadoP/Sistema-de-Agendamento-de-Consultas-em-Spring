package com.consultas.agendamento.repository;

import com.consultas.agendamento.model.Secretario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecretarioRepository extends JpaRepository<Secretario, String> {
}
