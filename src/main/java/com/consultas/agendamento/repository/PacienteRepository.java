package com.consultas.agendamento.repository;

import com.consultas.agendamento.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, String> {
}
