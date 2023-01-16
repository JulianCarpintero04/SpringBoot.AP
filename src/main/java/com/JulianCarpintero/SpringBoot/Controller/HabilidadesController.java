package com.JulianCarpintero.SpringBoot.Controller;

import com.JulianCarpintero.SpringBoot.Model.Habilidades;
import com.JulianCarpintero.SpringBoot.Service.HabilidadesService;
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
@RequestMapping("/habilidades")
public class HabilidadesController {
    private final HabilidadesService habilidadesService;
    
    
    public HabilidadesController(HabilidadesService habilidadesService){
        this.habilidadesService = habilidadesService;
    }
    
    @GetMapping("/todas")
    public ResponseEntity<List<Habilidades>> obtenerHabilidades(){
        List<Habilidades> habilidades=habilidadesService.buscarHabilidades();
        return new ResponseEntity<>(habilidades,HttpStatus.OK);
    }
    
    @PutMapping("/update")
    public ResponseEntity<Habilidades> editarHabilidades(@RequestBody Habilidades habilidades){
        Habilidades updateHabilidades=habilidadesService.editarHabilidades(habilidades);
        return new ResponseEntity<>(updateHabilidades,HttpStatus.OK);
    }
    
    @PostMapping("/agregar")
    public ResponseEntity<Habilidades> agregarHabilidad(@RequestBody Habilidades habilidades){
        Habilidades nuevaHabilidad = habilidadesService.addHabilidades(habilidades);
        return new ResponseEntity<>(nuevaHabilidad,HttpStatus.CREATED);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> borrarHabilidad(@PathVariable("id")Long id){
        habilidadesService.borrarHabilidades(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
