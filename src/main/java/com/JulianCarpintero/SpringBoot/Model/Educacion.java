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
public class Educacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEdu;
    private String tituloEdu;
    private int fechaEdu;
    private String descEdu;
    private String imagenEdu;


    public Educacion(){

    }

    public Educacion (Long IdEdu, String tituloEdu, int fechaEdu, String descEdu, String imagenEdu){
        this.idEdu = idEdu;
        this.tituloEdu = tituloEdu;
        this.fechaEdu = fechaEdu;
        this.descEdu = descEdu;
        this.imagenEdu = imagenEdu;
    }
}