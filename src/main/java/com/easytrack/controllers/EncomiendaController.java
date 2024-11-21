// Archivo: src/main/java/com/easytrack/controllers/EncomiendaController.java
package com.easytrack.controllers;

import com.easytrack.models.Encomienda;
import com.easytrack.services.EncomiendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/encomiendas")
@CrossOrigin(origins = "http://localhost:3000")
public class EncomiendaController {

    @Autowired
    private EncomiendaService encomiendaService;

    @GetMapping("/")
    public List<Encomienda> list() {
        return encomiendaService.findAll();
    }

    @GetMapping("/{id}")
    public Encomienda get(@PathVariable Long id) {
        return encomiendaService.findById(id);
    }

    @PostMapping("/")
    public Encomienda create(@RequestBody Encomienda encomienda) {
        return encomiendaService.save(encomienda);
    }

    @PutMapping("/{id}")
    public Encomienda update(@PathVariable Long id, @RequestBody Encomienda encomienda) {
        return encomiendaService.update(id, encomienda);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        encomiendaService.delete(id);
    }
}
