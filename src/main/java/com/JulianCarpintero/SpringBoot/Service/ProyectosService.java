package com.JulianCarpintero.SpringBoot.Service;

import Exception.UserNotFoundException;
import com.JulianCarpintero.SpringBoot.Model.Proyectos;
import com.JulianCarpintero.SpringBoot.Repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProyectosService {
    private final ProyectosRepository proyectosRepository;
    
    @Autowired
    public ProyectosService(ProyectosRepository proyectosRepository){
        this.proyectosRepository = proyectosRepository;
    }
    
    public Proyectos addProyectos(Proyectos proyectos){
        return proyectosRepository.save(proyectos);
    }
    
    public List<Proyectos> buscarProyectos(){
        return proyectosRepository.findAll();
    }
    
    public Proyectos editarProyectos(Proyectos proyectos){
        return proyectosRepository.save(proyectos);
    }
    
    public void borrarProyectos(Long id){
        proyectosRepository.deleteById(id);
    }
    
    public Proyectos buscarProyectosPorId(Long id){
        return proyectosRepository.findById(id).orElseThrow(()->new UserNotFoundException("Proyecto no encontrado"));
    }
}
