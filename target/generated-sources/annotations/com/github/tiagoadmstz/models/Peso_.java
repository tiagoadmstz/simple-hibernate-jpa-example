package com.github.tiagoadmstz.models;

import com.github.tiagoadmstz.models.Pessoa;
import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-03-25T00:19:45")
@StaticMetamodel(Peso.class)
public class Peso_ { 

    public static volatile SingularAttribute<Peso, Pessoa> pessoa;
    public static volatile SingularAttribute<Peso, Calendar> data;
    public static volatile SingularAttribute<Peso, Double> peso;
    public static volatile SingularAttribute<Peso, Double> imc;

}