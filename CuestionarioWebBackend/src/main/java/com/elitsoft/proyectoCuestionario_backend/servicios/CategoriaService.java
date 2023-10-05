
package com.elitsoft.proyectoCuestionario_backend.servicios;

import com.elitsoft.proyectoCuestionario_backend.entidades.Categoria;
import java.util.Set;

/**
 *
 * @author ELITSOFT86
 */
public interface CategoriaService {
    
    
    Categoria agregarCategoria(Categoria categoria);

    Categoria actualizarCategoria(Categoria categoria);

    Set<Categoria> obtenerCategorias();

    Categoria obtenerCategoria(Long categoriaId);

    void eliminarCategoria(Long categoriaId);
    
}
