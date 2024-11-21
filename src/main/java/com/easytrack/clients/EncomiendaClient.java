// Archivo: src/main/java/com/easytrack/clients/EncomiendaClient.java
package com.easytrack.clients;

import com.easytrack.models.Encomienda;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "encomiendaClient", url = "http://localhost:8000")
public interface EncomiendaClient {

    @GetMapping("/encomiendas/")
    List<Encomienda> getAllEncomiendas();

    @GetMapping("/encomiendas/{id}/")
    Encomienda getEncomiendaById(@PathVariable("id") Long id);

    @PostMapping("/encomiendas/")
    Encomienda createEncomienda(@RequestBody Encomienda encomienda);

    @PutMapping("/encomiendas/{id}/")
    Encomienda updateEncomienda(@PathVariable("id") Long id, @RequestBody Encomienda encomienda);

    @DeleteMapping("/encomiendas/{id}/")
    void deleteEncomienda(@PathVariable("id") Long id);
}
