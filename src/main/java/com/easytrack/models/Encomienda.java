// Archivo: src/main/java/com/easytrack/models/Encomienda.java
package com.easytrack.models;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Encomienda {
    private Long id;
    private String descripcion;
    private Cliente remitente;
    private Cliente destinatario;
    private Vehiculo vehiculo;
    private Terminal terminalPartida;
    private Terminal terminalDestino;
    private double volumen;
    private LocalDateTime fechaSalida;
    private LocalDateTime fechaLlegada;
    private String estado;
    private String condicionEnvio;
    private int cantidadPaquetes;
    private LocalDateTime fechaRegistro;
    private LocalDateTime fechaEntrega;
    private Empleado empleadoRegistro;
    private Empleado empleadoEntrega;
}
