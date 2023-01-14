package com.JulianCarpintero.SpringBoot.Service;

import Exception.UserNotFoundException;
import com.JulianCarpintero.SpringBoot.Model.Habilidades;
import com.JulianCarpintero.SpringBoot.Repository.HabilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HabilidadesService {
    private final HabilidadesRepository habilidadesRepository;
    
    @Autowired
    public HabilidadesService(HabilidadesRepository habilidadesRepository){
        this.habilidadesRepository = habilidadesRepository;
    }
    
    public Habilidades addHabilidades(Habilidades habilidades){
        return habilidadesRepository.save(habilidades);
    }
    
    public List<Habilidades> buscarHabilidades(){
        return habilidadesRepository.findAll();
    }
    
    public Habilidades editarHabilidades(Habilidades habilidades){
        return habilidadesRepository.save(habilidades);
    }
    
    public void borrarHabilidades(Long id){
        habilidadesRepository.deleteById(id);
    }
    
    public Habilidades buscarHabilidadesPorId(Long id){
        return habilidadesRepository.findById(id).orElseThrow(()->new UserNotFoundException("Habilidadad no encontrado"));
    }
}
