
package com.elitsoft.proyectoCuestionario_backend.servicios.impl;

import com.elitsoft.proyectoCuestionario_backend.entidades.Usuario;
import com.elitsoft.proyectoCuestionario_backend.entidades.UsuarioRol;
import com.elitsoft.proyectoCuestionario_backend.repositorios.RolRepository;
import com.elitsoft.proyectoCuestionario_backend.repositorios.UsuarioRepository;
import com.elitsoft.proyectoCuestionario_backend.servicios.UsuarioService;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Elitsoft83
 */
@Service
public class UsuarioServiceImpl implements UsuarioService{
    
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Autowired
    private RolRepository rolRepository;

    @Override
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception {
        Usuario usuarioLocal = usuarioRepository.findByUsername(usuario.getUsername());
        if(usuarioLocal != null){
            System.out.println("El usuario ya existe");
            throw new Exception("El usuario ya esta presente");
        }
        else{
            for(UsuarioRol usuarioRol:usuarioRoles){
                rolRepository.save(usuarioRol.getRol());
            }
            usuario.getUsuarioRoles().addAll(usuarioRoles);
            usuarioLocal = usuarioRepository.save(usuario);
        }
        return usuarioLocal;
    }
    
    @Override
    public Usuario obtenerUsuario(String username) {
        return usuarioRepository.findByUsername(username);
    }

    @Override
    public void eliminarUsuario(Long usuarioId) {
        usuarioRepository.deleteById(usuarioId);
    }
    
}
