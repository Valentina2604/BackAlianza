package com.example.demo.service;


import com.example.demo.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class ClienteService {
    private List<Cliente> clientes = new ArrayList<>();

    public List<Cliente> obtenerClientes() {
        return clientes;
    }

    public Cliente agregarCliente(Cliente cliente) {
        clientes.add(cliente);
        return cliente;
    }

    public List<Cliente> buscarPorSharedKey(String sharedKey) {
        return clientes.stream()
                .filter(cliente -> cliente.getSharedKey().equalsIgnoreCase(sharedKey))
                .collect(Collectors.toList());
    }
}

