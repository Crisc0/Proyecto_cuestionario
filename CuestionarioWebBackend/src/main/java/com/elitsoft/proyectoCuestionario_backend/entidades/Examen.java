
package com.elitsoft.proyectoCuestionario_backend.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ELITSOFT86
 */
@Entity
@Table ( name = "examenes")
@Data
public class Examen {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long examenId;
    private String PuntosMinimos;
    
    private String titulo;
    private String descripcion;
    private String puntosMaximos;
    private String numeroDePreguntas;
    private boolean activo = false;
    
    @ManyToOne(fetch = FetchType.EAGER)
    private Categoria categoria;
    
    @OneToMany(mappedBy="examen", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Pregunta> preguntas = new HashSet<>();



    
    
    
    
}
