package com.elitsoft.proyectoCuestionario_backend.servicios.impl;

import com.elitsoft.proyectoCuestionario_backend.entidades.Resultados;
import com.elitsoft.proyectoCuestionario_backend.repositorios.ResultadosRepository;
import com.elitsoft.proyectoCuestionario_backend.servicios.ResultadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultadosServiceImpl implements ResultadosService {
    @Autowired
    private ResultadosRepository resultadosRepository;


    @Override
    public List<Resultados> obtenerResultados() {
        List<Resultados>resultados = resultadosRepository.findAll();
        return resultados;

    }

    @Override
    public Boolean guardar_resultados(Resultados resultados){
        resultadosRepository.save(resultados);
        return true;
    }


}
