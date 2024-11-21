// Archivo: src/main/java/com/easytrack/services/EmpleadoService.java
package com.easytrack.services;

import com.easytrack.clients.EmpleadoClient;
import com.easytrack.models.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoClient empleadoClient;

    public List<Empleado> findAll() {
        return empleadoClient.getAllEmpleados();
    }

    public Empleado findById(Long id) {
        return empleadoClient.getEmpleadoById(id);
    }

    public Empleado save(Empleado empleado) {
        return empleadoClient.createEmpleado(empleado);
    }

    public Empleado update(Long id, Empleado empleado) {
        return empleadoClient.updateEmpleado(id, empleado);
    }

    public void delete(Long id) {
        empleadoClient.deleteEmpleado(id);
    }
}
