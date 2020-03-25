package com.github.tiagoadmstz.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CAD_USUARIO")
public class Usuario implements Serializable {

    private static final long serialVersionUID = -2220166494485780911L;
    @Id
    private Long id;
    private String nome;
    private String senha;

}
