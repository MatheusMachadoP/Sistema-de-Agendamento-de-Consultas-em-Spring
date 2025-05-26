package com.consultas.agendamento.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "consultas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Consulta {

    @Id
    @Column(name = "id_consulta", nullable = false, unique = true)
    private String idConsulta;

    @Column(nullable = false)
    private LocalDate data;

    @Column(nullable = false)
    private LocalTime horario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_paciente", nullable = false)
    private Paciente paciente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_medico", nullable = false)
    private Medico medico;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_secretario", nullable = false)
    private Secretario secretario;

    // Métodos da consulta
    public void confirmarConsulta() {}

    public void editarConsulta(LocalDate novaData, LocalTime novoHorario, Paciente novoPaciente, Medico novoMedico) {
        this.data = novaData;
        this.horario = novoHorario;
        this.paciente = novoPaciente;
        this.medico = novoMedico;
    }

    public void cancelarConsulta() {}
}