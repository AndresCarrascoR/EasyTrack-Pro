// Archivo: src/main/java/com/easytrack/clients/VehiculoClient.java
package com.easytrack.clients;

import com.easytrack.models.Vehiculo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "vehiculoClient", url = "http://localhost:8000")
public interface VehiculoClient {

    @GetMapping("/vehiculos/")
    List<Vehiculo> getAllVehiculos();

    @GetMapping("/vehiculos/{id}/")
    Vehiculo getVehiculoById(@PathVariable("id") Long id);

    @PostMapping("/vehiculos/")
    Vehiculo createVehiculo(@RequestBody Vehiculo vehiculo);

    @PutMapping("/vehiculos/{id}/")
    Vehiculo updateVehiculo(@PathVariable("id") Long id, @RequestBody Vehiculo vehiculo);

    @DeleteMapping("/vehiculos/{id}/")
    void deleteVehiculo(@PathVariable("id") Long id);
}
