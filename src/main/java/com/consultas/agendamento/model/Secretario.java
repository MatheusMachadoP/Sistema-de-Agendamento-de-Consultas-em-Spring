package com.consultas.agendamento.model;

<<<<<<< HEAD
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "secretarios")
=======
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
>>>>>>> 4587268eccff123f62f568505745882fefb1d571
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Secretario {

    @Id
<<<<<<< HEAD
    @Column(name = "id_secretario", nullable = false, unique = true)
    private String idSecretario;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
=======
    private String idSecretario;

    private String nome;
    private String email;
>>>>>>> 4587268eccff123f62f568505745882fefb1d571
    private String telefone;

    // Funções do secretário
    public void agendarHorario() {
    }

    public void cancelarHorario() {
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 4587268eccff123f62f568505745882fefb1d571
