package com.consultas.agendamento.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "medicos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Medico {

    @Id
    @Column(name = "id_medico", nullable = false, unique = true)
    private String idMedico;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String crm;

    @Column(nullable = false)
    private String especialidade;

    @Column(nullable = false, unique = true)
    private String email;

    // Metodo do medico
    public void visualizarAgenda() {
    }
}