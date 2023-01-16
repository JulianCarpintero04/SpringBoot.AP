package com.JulianCarpintero.SpringBoot.Controller;

import com.JulianCarpintero.SpringBoot.Model.Experiencia;
import com.JulianCarpintero.SpringBoot.Service.ExperienciaService;
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
@RequestMapping("/experiencia")
public class ExperienciaController {
    private final ExperienciaService experienciaService;
    
    
    public ExperienciaController(ExperienciaService experienciaService){
        this.experienciaService = experienciaService;
    }
    
    @GetMapping("/todas")
    public ResponseEntity<List<Experiencia>> obtenerExperiencias(){
        List<Experiencia> experiencias=experienciaService.buscarExperiencias();
        return new ResponseEntity<>(experiencias,HttpStatus.OK);
    }
    
    @PutMapping("/update")
    public ResponseEntity<Experiencia> editarExperiencia(@RequestBody Experiencia experiencia){
        Experiencia updateExperiencia=experienciaService.editarExperiencia(experiencia);
        return new ResponseEntity<>(updateExperiencia,HttpStatus.OK);
    }
    
    @PostMapping("/agregar")
    public ResponseEntity<Experiencia> agregarExperiencia(@RequestBody Experiencia experiencia){
        Experiencia nuevaExperiencia = experienciaService.addExperiencia(experiencia);
        return new ResponseEntity<>(nuevaExperiencia,HttpStatus.CREATED);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> borrarExperiencia(@PathVariable("id")Long id){
        experienciaService.borrarExperiencia(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
