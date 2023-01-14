package com.JulianCarpintero.SpringBoot.Repository;

import com.JulianCarpintero.SpringBoot.Model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EducacionRepository extends JpaRepository<Educacion, Long> {
    
}
