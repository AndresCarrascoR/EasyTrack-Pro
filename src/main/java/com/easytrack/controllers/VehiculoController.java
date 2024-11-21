// Archivo: src/main/java/com/easytrack/controllers/VehiculoController.java
package com.easytrack.controllers;

import com.easytrack.models.Vehiculo;
import com.easytrack.services.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehiculos")
@CrossOrigin(origins = "http://localhost:3000")
public class VehiculoController {

    @Autowired
    private VehiculoService vehiculoService;

    @GetMapping("/")
    public List<Vehiculo> list() {
        return vehiculoService.findAll();
    }

    @GetMapping("/{id}")
    public Vehiculo get(@PathVariable Long id) {
        return vehiculoService.findById(id);
    }

    @PostMapping("/")
    public Vehiculo create(@RequestBody Vehiculo vehiculo) {
        return vehiculoService.save(vehiculo);
    }

    @PutMapping("/{id}")
    public Vehiculo update(@PathVariable Long id, @RequestBody Vehiculo vehiculo) {
        return vehiculoService.update(id, vehiculo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        vehiculoService.delete(id);
    }
}
