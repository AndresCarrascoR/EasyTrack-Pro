// Archivo: src/main/java/com/easytrack/models/Vehiculo.java
package com.easytrack.models;

import lombok.Data;

@Data
public class Vehiculo {
    private Long id;
    private String placaVehiculo;
    private String estadoVehiculo;
}
