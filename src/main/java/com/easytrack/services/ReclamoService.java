// Archivo: src/main/java/com/easytrack/services/ReclamoService.java
package com.easytrack.services;

import com.easytrack.clients.ReclamoClient;
import com.easytrack.models.Reclamo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReclamoService {

    @Autowired
    private ReclamoClient reclamoClient;

    public List<Reclamo> findAll() {
        return reclamoClient.getAllReclamos();
    }

    public Reclamo findById(Long id) {
        return reclamoClient.getReclamoById(id);
    }

    public Reclamo save(Reclamo reclamo) {
        return reclamoClient.createReclamo(reclamo);
    }

    public Reclamo update(Long id, Reclamo reclamo) {
        return reclamoClient.updateReclamo(id, reclamo);
    }

    public void delete(Long id) {
        reclamoClient.deleteReclamo(id);
    }
}
