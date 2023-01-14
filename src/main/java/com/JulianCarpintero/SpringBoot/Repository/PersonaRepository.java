package com.JulianCarpintero.SpringBoot.Repository;

import com.JulianCarpintero.SpringBoot.Model.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonaRepository extends JpaRepository<Persona,Integer>{
    Optional<Persona> findByEmail(String email);
    
}
