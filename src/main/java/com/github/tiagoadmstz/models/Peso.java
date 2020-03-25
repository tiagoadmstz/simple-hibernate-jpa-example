package com.github.tiagoadmstz.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Calendar;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CAD_PESO")
public class Peso implements Serializable {

    private static final long serialVersionUID = -2391062397853380516L;
    @Id
    @Temporal(TemporalType.DATE)
    private Calendar data;
    @NotNull
    @ManyToOne
    private Pessoa pessoa;
    @NotNull
    private double peso;
    @NotNull
    private double imc;

}
