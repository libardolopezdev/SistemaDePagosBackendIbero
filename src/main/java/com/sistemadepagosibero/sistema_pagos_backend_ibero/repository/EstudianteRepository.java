package com.sistemadepagosibero.sistema_pagos_backend_ibero.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistemadepagosibero.sistema_pagos_backend_ibero.entities.Estudiante;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, String>{

    // metodo personalizado que busque a un estudiante por su codigo unico
    Estudiante findByCodigo (String codigo);

    // metodo personalizado que me muestre una lista de estudiantes que pertenecen a un grupo en especifico
    List<Estudiante> findByProgramaId(String programaId);
    
    
}
