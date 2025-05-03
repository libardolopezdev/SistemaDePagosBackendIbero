package com.sistemadepagosibero.sistema_pagos_backend_ibero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Anotación que indica que esta clase es la clase principal de la aplicación Spring Boot.
@SpringBootApplication
public class SistemaPagosBackendIberoApplication {

	// Método principal que inicia la aplicación Spring Boot.
	public static void main(String[] args) {
		// Ejecuta la aplicación Spring Boot con la clase actual como clase principal.
		SpringApplication.run(SistemaPagosBackendIberoApplication.class, args);
	}

}