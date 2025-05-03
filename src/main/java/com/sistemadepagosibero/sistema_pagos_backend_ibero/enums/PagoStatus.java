package com.sistemadepagosibero.sistema_pagos_backend_ibero.enums;

/**
 * Enum que representa los posibles estados de un pago.
 */
public enum PagoStatus {

    /**
     * Estado inicial del pago, recién creado.
     */
    CREADO,

    /**
     * El pago ha sido validado y aprobado.
     */
    VALIDADO,

    /**
     * El pago ha sido rechazado.
     */
    RECHAZADO
}