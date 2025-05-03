package com.sistemadepagosibero.sistema_pagos_backend_ibero.entities;

import java.time.LocalDate;

import com.sistemadepagosibero.sistema_pagos_backend_ibero.enums.PagoStatus;
import com.sistemadepagosibero.sistema_pagos_backend_ibero.enums.TypePago;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * Entidad que representa un pago en el sistema. Mapea a una tabla en la base de datos.  Se recomienda añadir @Table(name = "pagos") para mayor claridad.
 */
@Entity 
@Builder 
@Data 
@NoArgsConstructor 
@AllArgsConstructor 
public class Pagos {

    /**
     * ID único del pago, generado automáticamente por la base de datos.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Fecha del pago.
     */
    private LocalDate fecha; 

    /**
     * Cantidad del pago.
     */
    private Double cantidad;

    /**
     * Tipo de pago (ej. tarjeta de crédito, efectivo).
     */
    private TypePago type;

    /**
     * Estado del pago (ej. pendiente, procesado, completado).
     */
    private PagoStatus status;

    /**
     *  Ruta o nombre del archivo relacionado con el pago (si aplica).
     */
    private String file;


    /**
     * Relación con la entidad Estudiante (un pago pertenece a un estudiante).
     */
    @ManyToOne
    private Estudiante estudiante;    
}