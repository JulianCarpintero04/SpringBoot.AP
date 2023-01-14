package com.JulianCarpintero.SpringBoot.Repository;

import com.JulianCarpintero.SpringBoot.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long>{
    
}
