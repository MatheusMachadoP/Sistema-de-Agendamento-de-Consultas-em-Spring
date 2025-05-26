package com.consultas.agendamento.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "secretarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Secretario {

    @Id
    @Column(name = "id_secretario", nullable = false, unique = true)
    private String idSecretario;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String telefone;

    // Funções do secretário
    public void agendarHorario() {
    }

    public void cancelarHorario() {
    }
}