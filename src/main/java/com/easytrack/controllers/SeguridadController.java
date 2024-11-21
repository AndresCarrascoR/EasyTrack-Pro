// Archivo: src/main/java/com/easytrack/controllers/SeguridadController.java
package com.easytrack.controllers;

import com.easytrack.models.Seguridad;
import com.easytrack.services.SeguridadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/seguridad")
@CrossOrigin(origins = "http://localhost:3000")
public class SeguridadController {

    @Autowired
    private SeguridadService seguridadService;

    @GetMapping("/")
    public List<Seguridad> list() {
        return seguridadService.findAll();
    }

    @GetMapping("/{id}")
    public Seguridad get(@PathVariable Long id) {
        return seguridadService.findById(id);
    }

    @PostMapping("/")
    public Seguridad create(@RequestBody Seguridad seguridad) {
        return seguridadService.save(seguridad);
    }

    @PutMapping("/{id}")
    public Seguridad update(@PathVariable Long id, @RequestBody Seguridad seguridad) {
        return seguridadService.update(id, seguridad);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        seguridadService.delete(id);
    }
}
