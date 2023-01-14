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
public class Proyectos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPro;
    private String tituloPro;
    private int fechaPro;
    private String descPro;
    private String imagenPro;


    public Proyectos(){

    }

    public Proyectos (Long IdPro, String tituloPro, int fechaPro, String descPro, String imagenPro){
        this.idPro = idPro;
        this.tituloPro = tituloPro;
        this.fechaPro = fechaPro;
        this.descPro = descPro;
        this.imagenPro = imagenPro;
    }
}