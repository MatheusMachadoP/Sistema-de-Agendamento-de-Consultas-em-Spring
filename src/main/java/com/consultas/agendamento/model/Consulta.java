package com.consultas.agendamento.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Consulta {

    @Id
    private String idConsulta;

    private LocalDate data;
    private LocalTime horario;

    @ManyToOne
    private Paciente paciente;

    @ManyToOne
    private Medico medico;

    @ManyToOne
    private Secretario secretario;

    // Métodos da consulta
    public void confirmarConsulta() {
        
    }

    public void editarConsulta(LocalDate novaData, LocalTime novoHorario, Paciente novoPaciente, Medico novoMedico) {
        this.data = novaData;
        this.horario = novoHorario;
        this.paciente = novoPaciente;
        this.medico = novoMedico;
    }

    public void cancelarConsulta() {
        
    }
}
