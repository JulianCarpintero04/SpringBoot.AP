
package com.JulianCarpintero.SpringBoot.Service;

import com.JulianCarpintero.SpringBoot.Model.Usuario;
import java.util.List;


public interface IUsuarioService {
    public List<Usuario> verUsuarios ();
    
    public void crearUsuario (Usuario us);
    
    public void borrarUsuario (Long id);
    
    public Usuario buscarUsuario (Long id);
    
}
