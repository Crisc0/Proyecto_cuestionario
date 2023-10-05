
package com.elitsoft.proyectoCuestionario_backend.repositorios;

import com.elitsoft.proyectoCuestionario_backend.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Elitsoft83
 */
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    public Usuario findByUsername(String username);
}
