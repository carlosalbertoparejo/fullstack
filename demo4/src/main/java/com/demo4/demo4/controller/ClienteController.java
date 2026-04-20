package com.demo4.demo4.controller;

import com.demo4.demo4.Cliente;
import com.demo4.demo4.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @GetMapping
    public List<Cliente> listarClientes() {
        return service.obtenerClientes();
    }
}
