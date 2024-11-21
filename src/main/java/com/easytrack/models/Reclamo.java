// Archivo: src/main/java/com/easytrack/models/Reclamo.java
package com.easytrack.models;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Reclamo {
    private Long id;
    private Encomienda encomienda;
    private String motivo;
    private String descripcion;
    private LocalDateTime fecha;
    private String estado;
}
