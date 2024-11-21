// Archivo: src/main/java/com/easytrack/clients/ComprobanteClient.java
package com.easytrack.clients;

import com.easytrack.models.Comprobante;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "comprobanteClient", url = "http://localhost:8000")
public interface ComprobanteClient {

    @GetMapping("/comprobantes/")
    List<Comprobante> getAllComprobantes();

    @GetMapping("/comprobantes/{id}/")
    Comprobante getComprobanteById(@PathVariable("id") Long id);

    @PostMapping("/comprobantes/")
    Comprobante createComprobante(@RequestBody Comprobante comprobante);

    @PutMapping("/comprobantes/{id}/")
    Comprobante updateComprobante(@PathVariable("id") Long id, @RequestBody Comprobante comprobante);

    @DeleteMapping("/comprobantes/{id}/")
    void deleteComprobante(@PathVariable("id") Long id);
}
