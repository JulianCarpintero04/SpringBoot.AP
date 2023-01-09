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
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    private String contrasena;
    private boolean soyadmin;
    
    public Usuario(){
    }
    
    public Usuario(Long id, String email, String contrasena, boolean soyadmin){
        this.id = id;
        this.email = email;
        this.contrasena = contrasena;
        this.soyadmin = soyadmin;
    }
}
