// Archivo: src/main/java/com/easytrack/services/SeguridadService.java
package com.easytrack.services;

import com.easytrack.clients.SeguridadClient;
import com.easytrack.models.Seguridad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeguridadService {

    @Autowired
    private SeguridadClient seguridadClient;

    public List<Seguridad> findAll() {
        return seguridadClient.getAllSeguridad();
    }

    public Seguridad findById(Long id) {
        return seguridadClient.getSeguridadById(id);
    }

    public Seguridad save(Seguridad seguridad) {
        return seguridadClient.createSeguridad(seguridad);
    }

    public Seguridad update(Long id, Seguridad seguridad) {
        return seguridadClient.updateSeguridad(id, seguridad);
    }

    public void delete(Long id) {
        seguridadClient.deleteSeguridad(id);
    }
}
