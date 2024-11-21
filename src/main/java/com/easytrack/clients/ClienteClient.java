// Archivo: src/main/java/com/easytrack/clients/ClienteClient.java
package com.easytrack.clients;

import com.easytrack.models.Cliente;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "clienteClient", url = "http://localhost:8000")
public interface ClienteClient {

    @GetMapping("/clientes/")
    List<Cliente> getAllClientes();

    @GetMapping("/clientes/{id}/")
    Cliente getClienteById(@PathVariable("id") Long id);

    @PostMapping("/clientes/")
    Cliente createCliente(@RequestBody Cliente cliente);

    @PutMapping("/clientes/{id}/")
    Cliente updateCliente(@PathVariable("id") Long id, @RequestBody Cliente cliente);

    @DeleteMapping("/clientes/{id}/")
    void deleteCliente(@PathVariable("id") Long id);
}
