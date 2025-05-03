package com.sistemadepagosibero.sistema_pagos_backend_ibero.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistemadepagosibero.sistema_pagos_backend_ibero.entities.Pagos;
import com.sistemadepagosibero.sistema_pagos_backend_ibero.enums.PagoStatus;
import com.sistemadepagosibero.sistema_pagos_backend_ibero.enums.TypePago;

@Repository
public interface PagoRepository extends JpaRepository<Pagos, Long> {

    // metodo personalizado para buscar pagos por un estudiante especifico
    List<Pagos> findByEstudianteCodigo(String codigo);

    // metodo personalizado para buscar los pagos por su estado - CREADO, VALIDADO,
    // RECHAZADO
    List<Pagos> findByStatus(PagoStatus status);

    // metodo personalizado para buscar pagos por su tipo - EFECTIVO, CHEQUE,
    // TRANSFERENCIA, DEPOSITO
    List<Pagos> findByType(TypePago type);

}