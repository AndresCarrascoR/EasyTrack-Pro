// Archivo: src/main/java/com/easytrack/services/EncomiendaService.java
package com.easytrack.services;

import com.easytrack.clients.EncomiendaClient;
import com.easytrack.models.Encomienda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EncomiendaService {

    @Autowired
    private EncomiendaClient encomiendaClient;

    public List<Encomienda> findAll() {
        return encomiendaClient.getAllEncomiendas();
    }

    public Encomienda findById(Long id) {
        return encomiendaClient.getEncomiendaById(id);
    }

    public Encomienda save(Encomienda encomienda) {
        return encomiendaClient.createEncomienda(encomienda);
    }

    public Encomienda update(Long id, Encomienda encomienda) {
        return encomiendaClient.updateEncomienda(id, encomienda);
    }

    public void delete(Long id) {
        encomiendaClient.deleteEncomienda(id);
    }
}
