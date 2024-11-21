// Archivo: src/main/java/com/easytrack/models/Seguridad.java
package com.easytrack.models;

import lombok.Data;

@Data
public class Seguridad {
    private Long id;
    private Encomienda encomienda;
    private boolean claveHabilitada;
    private String claveEstatica;
}
