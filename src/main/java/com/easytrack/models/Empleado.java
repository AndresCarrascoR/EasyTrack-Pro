// Archivo: src/main/java/com/easytrack/models/Empleado.java
package com.easytrack.models;

import lombok.Data;

@Data
public class Empleado {
    private Long id;
    private String nombres;
    private String apellidos;
    private String correo;
    private String password;
}
