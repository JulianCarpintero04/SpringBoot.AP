package com.JulianCarpintero.SpringBoot.Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Habilidades implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSkill;
    private String nombreSkill;
    private int porcentaje;


    public Habilidades(){

    }

    public Habilidades(Long idSkill, String nombreSkill, int porcentaje){
        this.idSkill = idSkill;
        this.nombreSkill = nombreSkill;
        this.porcentaje = porcentaje;
    }
}