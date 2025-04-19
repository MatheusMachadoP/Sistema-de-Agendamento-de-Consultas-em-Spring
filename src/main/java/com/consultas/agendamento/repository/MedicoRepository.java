package com.consultas.agendamento.repository;

import com.consultas.agendamento.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, String> {
}
