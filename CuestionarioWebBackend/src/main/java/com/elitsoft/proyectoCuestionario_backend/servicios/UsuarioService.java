
package com.elitsoft.proyectoCuestionario_backend.servicios;

import com.elitsoft.proyectoCuestionario_backend.entidades.Usuario;
import com.elitsoft.proyectoCuestionario_backend.entidades.UsuarioRol;
import java.util.Set;

/**
 *
 * @author Elitsoft83
 */
public interface UsuarioService {
    
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

    public Usuario obtenerUsuario(String username);

    public void eliminarUsuario(Long usuarioId);
    
}
