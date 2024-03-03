package io.github.jonathancmps.vendas.domain.repository;

import io.github.jonathancmps.vendas.domain.entity.Cliente;
import io.github.jonathancmps.vendas.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Pedidos extends JpaRepository<Pedido, Integer> {

    List<Pedido> findByCliente(Cliente cliente);
}