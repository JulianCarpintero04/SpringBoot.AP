package com.JulianCarpintero.SpringBoot.Repository;

import com.JulianCarpintero.SpringBoot.Model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ExperienciaRepository extends JpaRepository<Experiencia, Long> {
    
}
