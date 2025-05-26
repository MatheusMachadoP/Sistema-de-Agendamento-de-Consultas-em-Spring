package com.consultas.agendamento.repository;

import com.consultas.agendamento.model.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultaRepository extends JpaRepository<Consulta, String> {
}
