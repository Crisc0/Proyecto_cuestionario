
package com.elitsoft.proyectoCuestionario_backend.servicios.impl;

import com.elitsoft.proyectoCuestionario_backend.entidades.Examen;
import com.elitsoft.proyectoCuestionario_backend.entidades.Pregunta;
import com.elitsoft.proyectoCuestionario_backend.repositorios.PreguntaRepository;
import com.elitsoft.proyectoCuestionario_backend.servicios.PreguntaService;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ELITSOFT86
 */
@Service
public class PreguntaServiceImpl implements PreguntaService {

    @Autowired
    private PreguntaRepository preguntaRepository;

    @Override
    public Pregunta agregarPregunta(Pregunta pregunta) {
        return preguntaRepository.save(pregunta);
    }

    @Override
    public Pregunta actualizarPregunta(Pregunta pregunta) {
        return preguntaRepository.save(pregunta);
    }

    @Override
    public Set<Pregunta> obtenerPreguntas() {
        
        return (Set<Pregunta>) preguntaRepository.findAll();
    }

    @Override
    public Pregunta obtenerPregunta(Long preguntaId) {
        return preguntaRepository.findById(preguntaId).get();
    }

    @Override
    public Set<Pregunta> obtenerPreguntasDelExamen(Examen examen) {
        return preguntaRepository.findByExamen(examen);
    }

    @Override
    public void eliminarPregunta(Long preguntaId) {
        Pregunta pregunta = new Pregunta();
        pregunta.setPreguntaId(preguntaId);
        preguntaRepository.delete(pregunta);
    }

    @Override
    public Pregunta listarPregunta(Long preguntaId) {
        return this.preguntaRepository.getOne(preguntaId);
    }
}
