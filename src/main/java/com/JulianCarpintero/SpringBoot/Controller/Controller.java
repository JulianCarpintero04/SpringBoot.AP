package com.JulianCarpintero.SpringBoot.Controller;

import com.JulianCarpintero.SpringBoot.Model.Usuario;
import com.JulianCarpintero.SpringBoot.Service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
;

@RestController
public class Controller {
   
    @Autowired
    private IUsuarioService usuServ;
    
            
    @PostMapping("/new/usuario")
    public void agregarUsuario (@RequestBody Usuario us){
        usuServ.crearUsuario(us);
    }
    
    @GetMapping("/ver/usuarios")
    @ResponseBody
    public List<Usuario> verUsuarios(){
        return usuServ.verUsuarios();
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarUsuario(@PathVariable Long id){
        usuServ.borrarUsuario(id);
    }
}
