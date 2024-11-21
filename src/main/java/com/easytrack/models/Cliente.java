// Archivo: src/main/java/com/easytrack/models/Cliente.java
package com.easytrack.models;

import lombok.Data;

@Data
public class Cliente {
    private Long id;
    private String dni;
    private String nombres;
    private String apellidos;
    private String telefono;
}
