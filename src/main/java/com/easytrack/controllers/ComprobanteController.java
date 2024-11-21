// Archivo: src/main/java/com/easytrack/controllers/ComprobanteController.java
package com.easytrack.controllers;

import com.easytrack.models.Comprobante;
import com.easytrack.services.ComprobanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comprobantes")
@CrossOrigin(origins = "http://localhost:3000")
public class ComprobanteController {

    @Autowired
    private ComprobanteService comprobanteService;

    @GetMapping("/")
    public List<Comprobante> list() {
        return comprobanteService.findAll();
    }

    @GetMapping("/{id}")
    public Comprobante get(@PathVariable Long id) {
        return comprobanteService.findById(id);
    }

    @PostMapping("/")
    public Comprobante create(@RequestBody Comprobante comprobante) {
        return comprobanteService.save(comprobante);
    }

    @PutMapping("/{id}")
    public Comprobante update(@PathVariable Long id, @RequestBody Comprobante comprobante) {
        return comprobanteService.update(id, comprobante);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        comprobanteService.delete(id);
    }
}
