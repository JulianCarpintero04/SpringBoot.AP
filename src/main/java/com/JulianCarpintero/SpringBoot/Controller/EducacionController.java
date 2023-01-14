package com.JulianCarpintero.SpringBoot.Controller;

import com.JulianCarpintero.SpringBoot.Model.Educacion;
import com.JulianCarpintero.SpringBoot.Service.EducacionService;
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
@RequestMapping("/api/educacion")
public class EducacionController {
    private final EducacionService educacionService;
    
    
    public EducacionController(EducacionService educacionService){
        this.educacionService = educacionService;
    }
    
    @GetMapping
    public ResponseEntity<List<Educacion>> obtenerEducaciones(){
        List<Educacion> educaciones=educacionService.buscarEducaciones();
        return new ResponseEntity<>(educaciones,HttpStatus.OK);
    }
    
    @PutMapping
    public ResponseEntity<Educacion> editarEducacion(@RequestBody Educacion educacion){
        Educacion updateEducacion=educacionService.editarEducacion(educacion);
        return new ResponseEntity<>(updateEducacion,HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<Educacion> agregarEducacion(@RequestBody Educacion educacion){
        Educacion nuevaEducacion = educacionService.addEducacion(educacion);
        return new ResponseEntity<>(nuevaEducacion,HttpStatus.CREATED);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> borrarEducacion(@PathVariable("id")Long id){
        educacionService.borrarEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
