// Archivo: src/main/java/com/easytrack/services/VehiculoService.java
package com.easytrack.services;

import com.easytrack.clients.VehiculoClient;
import com.easytrack.models.Vehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculoService {

    @Autowired
    private VehiculoClient vehiculoClient;

    public List<Vehiculo> findAll() {
        return vehiculoClient.getAllVehiculos();
    }

    public Vehiculo findById(Long id) {
        return vehiculoClient.getVehiculoById(id);
    }

    public Vehiculo save(Vehiculo vehiculo) {
        return vehiculoClient.createVehiculo(vehiculo);
    }

    public Vehiculo update(Long id, Vehiculo vehiculo) {
        return vehiculoClient.updateVehiculo(id, vehiculo);
    }

    public void delete(Long id) {
        vehiculoClient.deleteVehiculo(id);
    }
}
