package com.consultas.agendamento.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "pacientes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paciente {

    @Id
    @Column(name = "id_paciente", nullable = false, unique = true)
    private String idPaciente;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String cpf;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String telefone;

    @Column(name = "data_nascimento", nullable = false)
    private String dataNascimento;

    // Métodos solicitados
    public void marcarConsulta() {
    }

    public void cancelarConsulta() {
    }

    public void visualizarHistorico() {
    }
}