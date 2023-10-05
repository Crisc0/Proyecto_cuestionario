
package com.elitsoft.proyectoCuestionario_backend.repositorios;

import com.elitsoft.proyectoCuestionario_backend.entidades.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ELITSOFT86
 */
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    
}
