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
public class Experiencia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExp;
    private String tituloExp;
    private int fechaExp;
    private String descExp;
    private String imagenExp;


    public Experiencia(){

    }

    public Experiencia (Long IdExp, String tituloExp, int fechaExp, String descExp, String imagenExp){
        this.idExp = idExp;
        this.tituloExp = tituloExp;
        this.fechaExp = fechaExp;
        this.descExp = descExp;
        this.imagenExp = imagenExp;
    }
}