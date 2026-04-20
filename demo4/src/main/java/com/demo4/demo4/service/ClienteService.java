package com.demo4.demo4.service;

import com.demo4.demo4.Cliente;
import com.demo4.demo4.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository repo;

    public ClienteService(ClienteRepository repo) {
        this.repo = repo;
    }

    public List<Cliente> obtenerClientes() {
        return repo.findAll();
    }
}
