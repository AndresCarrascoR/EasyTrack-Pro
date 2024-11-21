// Archivo: src/main/java/com/easytrack/controllers/EmpleadoController.java
package com.easytrack.controllers;

import com.easytrack.models.Empleado;
import com.easytrack.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empleados")
@CrossOrigin(origins = "http://localhost:3000")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/")
    public List<Empleado> list() {
        return empleadoService.findAll();
    }

    @GetMapping("/{id}")
    public Empleado get(@PathVariable Long id) {
        return empleadoService.findById(id);
    }

    @PostMapping("/")
    public Empleado create(@RequestBody Empleado empleado) {
        return empleadoService.save(empleado);
    }

    @PutMapping("/{id}")
    public Empleado update(@PathVariable Long id, @RequestBody Empleado empleado) {
        return empleadoService.update(id, empleado);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        empleadoService.delete(id);
    }
}
