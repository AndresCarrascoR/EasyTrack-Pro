// Archivo: src/main/java/com/easytrack/controllers/TerminalController.java
package com.easytrack.controllers;

import com.easytrack.models.Terminal;
import com.easytrack.services.TerminalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/terminales")
@CrossOrigin(origins = "http://localhost:3000")
public class TerminalController {

    @Autowired
    private TerminalService terminalService;

    @GetMapping("/")
    public List<Terminal> list() {
        return terminalService.findAll();
    }

    @GetMapping("/{id}")
    public Terminal get(@PathVariable Long id) {
        return terminalService.findById(id);
    }

    @PostMapping("/")
    public Terminal create(@RequestBody Terminal terminal) {
        return terminalService.save(terminal);
    }

    @PutMapping("/{id}")
    public Terminal update(@PathVariable Long id, @RequestBody Terminal terminal) {
        return terminalService.update(id, terminal);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        terminalService.delete(id);
    }
}
