package com.JulianCarpintero.SpringBoot.Repository;

import com.JulianCarpintero.SpringBoot.Model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProyectosRepository extends JpaRepository<Proyectos, Long> {
    
}
