
package com.JulianCarpintero.SpringBoot.Service;

import Exception.UserNotFoundException;
import com.JulianCarpintero.SpringBoot.Model.Usuario;
import com.JulianCarpintero.SpringBoot.Repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UsuarioService{
    private final UsuarioRepository usuarioRepository;
    
    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }
    
   public Usuario addUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
    
    public List<Usuario> buscarUsuarios(){
        return usuarioRepository.findAll();
    }
    
    public Usuario editarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
    
    public void borrarUsuario(Long id){
        usuarioRepository.deleteById(id);
    }
    
    public Usuario buscarUsuarioPorId(Long id){
        return usuarioRepository.findById(id).orElseThrow(()->new UserNotFoundException("Usuario no encontrado"));
    }
    
}
