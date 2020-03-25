package com.github.tiagoadmstz.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.io.Serializable;
import java.util.Calendar;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CAD_PESSOA")
@NamedQueries({
        @NamedQuery(name = "Pessoa.findOne", query = "FROM Pessoa AS p WHERE p.id = :id")
})
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 3544740945467701096L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @NotEmpty
    private String nome;
    @Past
    @NotNull
    @Temporal(TemporalType.DATE)
    private Calendar dataNascimento;
    @Digits(integer = 1, fraction = 2)
    private Double altura;
    @OneToOne
    private Usuario usuario;
    @NotNull
    @NotEmpty
    private String sexo;

}
