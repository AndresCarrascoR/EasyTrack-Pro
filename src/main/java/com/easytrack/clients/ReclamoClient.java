// Archivo: src/main/java/com/easytrack/clients/ReclamoClient.java
package com.easytrack.clients;

import com.easytrack.models.Reclamo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "reclamoClient", url = "http://localhost:8000")
public interface ReclamoClient {

    @GetMapping("/reclamos/")
    List<Reclamo> getAllReclamos();

    @GetMapping("/reclamos/{id}/")
    Reclamo getReclamoById(@PathVariable("id") Long id);

    @PostMapping("/reclamos/")
    Reclamo createReclamo(@RequestBody Reclamo reclamo);

    @PutMapping("/reclamos/{id}/")
    Reclamo updateReclamo(@PathVariable("id") Long id, @RequestBody Reclamo reclamo);

    @DeleteMapping("/reclamos/{id}/")
    void deleteReclamo(@PathVariable("id") Long id);
}
