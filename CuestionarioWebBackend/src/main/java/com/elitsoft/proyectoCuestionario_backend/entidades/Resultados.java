package com.elitsoft.proyectoCuestionario_backend.entidades;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "resultados")
public class Resultados {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String usuario;
    private Integer resultados_examen;
    private Integer tiempo;


}
