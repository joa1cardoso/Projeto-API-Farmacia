package com.br.joao.projetos.projeto_farmacia_api.repository;

import com.br.joao.projetos.projeto_farmacia_api.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
