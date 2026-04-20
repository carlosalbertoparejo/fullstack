package com.demo4.demo4.repository;

import com.demo4.demo4.Cliente;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClienteRepository {

    private final List<Cliente> clientes = List.of(
            new Cliente("Carlos Parejo", "carlos@parejo.com")
    );

    public List<Cliente> findAll() {
        return clientes;
    }
}
