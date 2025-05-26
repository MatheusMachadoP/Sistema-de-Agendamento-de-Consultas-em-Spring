package com.consultas.agendamento.model;

<<<<<<< HEAD
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "pacientes")
=======
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
>>>>>>> 4587268eccff123f62f568505745882fefb1d571
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paciente {

    @Id
<<<<<<< HEAD
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
=======
    private String idPaciente;

    private String nome;
    private String cpf;
    private String email;
    private String telefone;
>>>>>>> 4587268eccff123f62f568505745882fefb1d571
    private String dataNascimento;

    // Métodos solicitados
    public void marcarConsulta() {
    }

    public void cancelarConsulta() {
    }

    public void visualizarHistorico() {
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 4587268eccff123f62f568505745882fefb1d571
