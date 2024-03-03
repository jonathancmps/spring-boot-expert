package io.github.jonathancmps.vendas.domain.repository;

import io.github.jonathancmps.vendas.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto,Integer> {
}
