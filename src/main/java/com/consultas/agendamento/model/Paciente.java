package com.consultas.agendamento.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paciente {

    @Id
    private String idPaciente;

    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String dataNascimento;

    // Métodos solicitados
    public void marcarConsulta() {
    }

    public void cancelarConsulta() {
    }

    public void visualizarHistorico() {
    }
}
