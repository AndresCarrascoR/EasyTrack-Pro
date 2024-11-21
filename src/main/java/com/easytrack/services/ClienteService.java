// Archivo: src/main/java/com/easytrack/services/ClienteService.java
package com.easytrack.services;

import com.easytrack.clients.ClienteClient;
import com.easytrack.models.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteClient clienteClient;

    public List<Cliente> findAll() {
        return clienteClient.getAllClientes();
    }

    public Cliente findById(Long id) {
        return clienteClient.getClienteById(id);
    }

    public Cliente save(Cliente cliente) {
        return clienteClient.createCliente(cliente);
    }

    public Cliente update(Long id, Cliente cliente) {
        return clienteClient.updateCliente(id, cliente);
    }

    public void delete(Long id) {
        clienteClient.deleteCliente(id);
    }
}
