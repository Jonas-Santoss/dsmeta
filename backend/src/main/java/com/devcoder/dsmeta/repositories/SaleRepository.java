package com.devcoder.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcoder.dsmeta.entities.Sale;

public interface SaleRepository  extends JpaRepository<Sale, Long> { // Cria um componente que salva, deleta e busca as vendas 

}
