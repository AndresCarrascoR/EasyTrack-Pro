// Archivo: src/main/java/com/easytrack/models/Terminal.java
package com.easytrack.models;

import lombok.Data;

@Data
public class Terminal {
    private Long id;
    private String nombre;
    private String direccion;
    private String ubicacion;
}
