// Archivo: src/main/java/com/easytrack/controllers/ReclamoController.java
package com.easytrack.controllers;

import com.easytrack.models.Reclamo;
import com.easytrack.services.ReclamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reclamos")
@CrossOrigin(origins = "http://localhost:3000")
public class ReclamoController {

    @Autowired
    private ReclamoService reclamoService;

    @GetMapping("/")
    public List<Reclamo> list() {
        return reclamoService.findAll();
    }

    @GetMapping("/{id}")
    public Reclamo get(@PathVariable Long id) {
        return reclamoService.findById(id);
    }

    @PostMapping("/")
    public Reclamo create(@RequestBody Reclamo reclamo) {
        return reclamoService.save(reclamo);
    }

    @PutMapping("/{id}")
    public Reclamo update(@PathVariable Long id, @RequestBody Reclamo reclamo) {
        return reclamoService.update(id, reclamo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        reclamoService.delete(id);
    }
}
