
package com.JulianCarpintero.SpringBoot.Service;

import com.JulianCarpintero.SpringBoot.Model.Usuario;
import com.JulianCarpintero.SpringBoot.Repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    public UsuarioRepository usuRepo;
    
    @Override
    public List<Usuario> verUsuarios() {
        return usuRepo.findAll();
    }

    @Override
    public void crearUsuario(Usuario us) {
        usuRepo.save(us);
    }

    @Override
    public void borrarUsuario(Long id) {
        usuRepo.deleteById(id);
    }

    @Override
    public Usuario buscarUsuario(Long id) {
        return usuRepo.findById(id).orElse(null);
    }
    
}
