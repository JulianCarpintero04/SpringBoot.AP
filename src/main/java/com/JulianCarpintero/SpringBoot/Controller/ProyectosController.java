package com.JulianCarpintero.SpringBoot.Controller;

import com.JulianCarpintero.SpringBoot.Model.Proyectos;
import com.JulianCarpintero.SpringBoot.Service.ProyectosService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/proyectos")
public class ProyectosController {
    private final ProyectosService proyectosService;
    
    
    public ProyectosController(ProyectosService proyectosService){
        this.proyectosService = proyectosService;
    }
    
    @GetMapping
    public ResponseEntity<List<Proyectos>> obtenerProyectos(){
        List<Proyectos> proyectos=proyectosService.buscarProyectos();
        return new ResponseEntity<>(proyectos,HttpStatus.OK);
    }
    
    @PutMapping
    public ResponseEntity<Proyectos> editarProyectos(@RequestBody Proyectos proyectos){
        Proyectos updateProyectos=proyectosService.editarProyectos(proyectos);
        return new ResponseEntity<>(updateProyectos,HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<Proyectos> agregarProyecto(@RequestBody Proyectos proyectos){
        Proyectos nuevoProyecto = proyectosService.addProyectos(proyectos);
        return new ResponseEntity<>(nuevoProyecto,HttpStatus.CREATED);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> borrarProyecto(@PathVariable("id")Long id){
        proyectosService.borrarProyectos(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
