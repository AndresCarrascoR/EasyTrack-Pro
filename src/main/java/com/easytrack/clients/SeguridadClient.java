// Archivo: src/main/java/com/easytrack/clients/SeguridadClient.java
package com.easytrack.clients;

import com.easytrack.models.Seguridad;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "seguridadClient", url = "http://localhost:8000")
public interface SeguridadClient {

    @GetMapping("/seguridad/")
    List<Seguridad> getAllSeguridad();

    @GetMapping("/seguridad/{id}/")
    Seguridad getSeguridadById(@PathVariable("id") Long id);

    @PostMapping("/seguridad/")
    Seguridad createSeguridad(@RequestBody Seguridad seguridad);

    @PutMapping("/seguridad/{id}/")
    Seguridad updateSeguridad(@PathVariable("id") Long id, @RequestBody Seguridad seguridad);

    @DeleteMapping("/seguridad/{id}/")
    void deleteSeguridad(@PathVariable("id") Long id);
}
