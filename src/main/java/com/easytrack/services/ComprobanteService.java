// Archivo: src/main/java/com/easytrack/services/ComprobanteService.java
package com.easytrack.services;

import com.easytrack.clients.ComprobanteClient;
import com.easytrack.models.Comprobante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComprobanteService {

    @Autowired
    private ComprobanteClient comprobanteClient;

    public List<Comprobante> findAll() {
        return comprobanteClient.getAllComprobantes();
    }

    public Comprobante findById(Long id) {
        return comprobanteClient.getComprobanteById(id);
    }

    public Comprobante save(Comprobante comprobante) {
        return comprobanteClient.createComprobante(comprobante);
    }

    public Comprobante update(Long id, Comprobante comprobante) {
        return comprobanteClient.updateComprobante(id, comprobante);
    }

    public void delete(Long id) {
        comprobanteClient.deleteComprobante(id);
    }
}
