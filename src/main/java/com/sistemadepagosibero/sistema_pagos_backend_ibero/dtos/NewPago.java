package com.sistemadepagosibero.sistema_pagos_backend_ibero.dtos;

import com.sistemadepagosibero.sistema_pagos_backend_ibero.enums.TypePago;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate; // Importación implícita necesaria (ver observaciones)

/**
 * Clase DTO para representar la información de un nuevo pago en el sistema.
 * Contiene los datos necesarios para registrar un pago, como la cantidad, el tipo de pago,
 * la fecha y el código del estudiante.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewPago {
    /**
     * La cantidad monetaria del pago.
     */
    private double cantidad;

    /**
     * El tipo de pago, definido por la enumeración TypePago.
     */
    private TypePago typePago;

    /**
     * La fecha en la que se realiza el pago.
     */
    private LocalDate date;

    /**
     * El código único del estudiante asociado al pago.
     */
    private String codigoEstudiante;
}
    

