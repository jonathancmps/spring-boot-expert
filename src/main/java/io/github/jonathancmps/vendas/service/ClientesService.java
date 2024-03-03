package io.github.jonathancmps.vendas.service;

import io.github.jonathancmps.vendas.model.Cliente;
import io.github.jonathancmps.vendas.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    @Autowired
    ClientesRepository repository;

    public void salvarCliente(Cliente cliente ) {
        validarCliente(cliente);
        repository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente) {
     // aplica validacoes
    }
}
