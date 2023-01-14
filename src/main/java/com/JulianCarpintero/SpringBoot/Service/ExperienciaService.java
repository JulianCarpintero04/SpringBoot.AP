package com.JulianCarpintero.SpringBoot.Service;

import Exception.UserNotFoundException;
import com.JulianCarpintero.SpringBoot.Model.Experiencia;
import com.JulianCarpintero.SpringBoot.Repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExperienciaService {
    private final ExperienciaRepository experienciaRepository;
    
    
    @Autowired
    public ExperienciaService(ExperienciaRepository experienciaRepository){
        this.experienciaRepository = experienciaRepository;
    }
    
    public Experiencia addExperiencia(Experiencia experiencia){
        return experienciaRepository.save(experiencia);
    }
    
    public List<Experiencia> buscarExperiencias(){
        return experienciaRepository.findAll();
    }
    
    public Experiencia editarExperiencia(Experiencia experiencia){
        return experienciaRepository.save(experiencia);
    }
    
    public void borrarExperiencia(Long id){
        experienciaRepository.deleteById(id);
    }
    
    public Experiencia buscarExperienciaPorId(Long id){
        return experienciaRepository.findById(id).orElseThrow(()->new UserNotFoundException("Experiencia no encontrado"));
    }
}
