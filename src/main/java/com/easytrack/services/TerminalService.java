// Archivo: src/main/java/com/easytrack/services/TerminalService.java
package com.easytrack.services;

import com.easytrack.clients.TerminalClient;
import com.easytrack.models.Terminal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TerminalService {

    @Autowired
    private TerminalClient terminalClient;

    public List<Terminal> findAll() {
        return terminalClient.getAllTerminales();
    }

    public Terminal findById(Long id) {
        return terminalClient.getTerminalById(id);
    }

    public Terminal save(Terminal terminal) {
        return terminalClient.createTerminal(terminal);
    }

    public Terminal update(Long id, Terminal terminal) {
        return terminalClient.updateTerminal(id, terminal);
    }

    public void delete(Long id) {
        terminalClient.deleteTerminal(id);
    }
}
