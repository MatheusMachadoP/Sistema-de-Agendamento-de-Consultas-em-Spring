package com.consultas.agendamento.model;

<<<<<<< HEAD
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "medicos")
=======
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
>>>>>>> 4587268eccff123f62f568505745882fefb1d571
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Medico {

    @Id
<<<<<<< HEAD
    @Column(name = "id_medico", nullable = false, unique = true)
    private String idMedico;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String crm;

    @Column(nullable = false)
    private String especialidade;

    @Column(nullable = false, unique = true)
=======
    private String idMedico;

    private String nome;
    private String crm;
    private String especialidade;
>>>>>>> 4587268eccff123f62f568505745882fefb1d571
    private String email;

    // Metodo do medico
    public void visualizarAgenda() {
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 4587268eccff123f62f568505745882fefb1d571
