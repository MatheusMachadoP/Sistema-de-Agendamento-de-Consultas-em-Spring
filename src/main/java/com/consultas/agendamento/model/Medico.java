package com.consultas.agendamento.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Medico {

    @Id
    private String idMedico;

    private String nome;
    private String crm;
    private String especialidade;
    private String email;

    // Função do médico
    public void visualizarAgenda() {
    }
}
