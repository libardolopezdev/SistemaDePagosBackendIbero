package com.sistemadepagosibero.sistema_pagos_backend_ibero.entities; // Paquete donde se encuentra la clase Estudiante

import org.springframework.data.annotation.Id; // Importación para anotar el ID como clave primaria
import jakarta.persistence.Column; // Importación para configurar la columna de la base de datos
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor; // Lombok: Constructor con todos los argumentos
import lombok.Builder; // Lombok: Constructor con patrón Builder
import lombok.Data; // Lombok: Getters, setters, toString(), equals(), hashCode()
import lombok.NoArgsConstructor; // Lombok: Constructor sin argumentos


@Entity // JPA: Indica que esta clase representa una entidad en la base de datos
@Builder // Lombok: Crea un builder para instanciar objetos Estudiante
@Data // Lombok: Genera automáticamente getters, setters, etc.
@NoArgsConstructor // Lombok: Crea un constructor sin argumentos
@AllArgsConstructor // Lombok: Crea un constructor con todos los argumentos
//@Table(name = "estudiantes") // Opcional: Especifica el nombre de la tabla en la base de datos (recomendado)
public class Estudiante {

    @Id // JPA: Define este campo como clave primaria
    private String id; // Identificador único del estudiante
    private String nombre; // Nombre del estudiante
    private String apellido; // Apellido del estudiante

    @Column(unique = true) // JPA: Define la columna como única en la base de datos
    private String codigo; // Código único del estudiante

    private String programaId; // ID del programa al que pertenece el estudiante
    private String foto; // URL o ruta de la foto del estudiante
}