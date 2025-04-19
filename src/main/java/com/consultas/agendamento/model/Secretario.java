package com.consultas.agendamento.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Secretario {

    @Id
    private String idSecretario;

    private String nome;
    private String email;
    private String telefone;

    // Funções do secretário
    public void agendarHorario() {
    }

    public void cancelarHorario() {
    }
}
