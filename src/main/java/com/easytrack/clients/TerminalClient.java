// Archivo: src/main/java/com/easytrack/clients/TerminalClient.java
package com.easytrack.clients;

import com.easytrack.models.Terminal;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "terminalClient", url = "http://localhost:8000")
public interface TerminalClient {

    @GetMapping("/terminales/")
    List<Terminal> getAllTerminales();

    @GetMapping("/terminales/{id}/")
    Terminal getTerminalById(@PathVariable("id") Long id);

    @PostMapping("/terminales/")
    Terminal createTerminal(@RequestBody Terminal terminal);

    @PutMapping("/terminales/{id}/")
    Terminal updateTerminal(@PathVariable("id") Long id, @RequestBody Terminal terminal);

    @DeleteMapping("/terminales/{id}/")
    void deleteTerminal(@PathVariable("id") Long id);
}
