package com.sistemadepagosibero.sistema_pagos_backend_ibero.enums;

/**
 * Enum que define los diferentes tipos de pago aceptados.
 */
public enum TypePago {

    /**
     * Pago realizado en efectivo.
     */
    EFECTIVO,

    /**
     * Pago realizado mediante cheque.
     */
    CHEQUE,

    /**
     * Pago realizado mediante transferencia bancaria.
     */
    TRANSFERENCIA,

    /**
     * Pago realizado mediante depósito bancario.
     */
    DEPOSITO
}
