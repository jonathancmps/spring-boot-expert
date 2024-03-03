package io.github.jonathancmps.vendas.domain.repository;

import io.github.jonathancmps.vendas.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsPedido extends JpaRepository<ItemPedido, Integer> {
}