// Archivo: src/main/java/com/easytrack/models/Comprobante.java
package com.easytrack.models;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Comprobante {
    private Long id;
    private Encomienda encomienda;
    private String estadoPago;
    private double monto;
    private LocalDateTime fechaPago;
}
