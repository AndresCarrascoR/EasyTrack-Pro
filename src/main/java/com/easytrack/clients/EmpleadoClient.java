// Archivo: src/main/java/com/easytrack/clients/EmpleadoClient.java
package com.easytrack.clients;

import com.easytrack.models.Empleado;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "empleadoClient", url = "http://localhost:8000")
public interface EmpleadoClient {

    @GetMapping("/empleados/")
    List<Empleado> getAllEmpleados();

    @GetMapping("/empleados/{id}/")
    Empleado getEmpleadoById(@PathVariable("id") Long id);

    @PostMapping("/empleados/")
    Empleado createEmpleado(@RequestBody Empleado empleado);

    @PutMapping("/empleados/{id}/")
    Empleado updateEmpleado(@PathVariable("id") Long id, @RequestBody Empleado empleado);

    @DeleteMapping("/empleados/{id}/")
    void deleteEmpleado(@PathVariable("id") Long id);
}
