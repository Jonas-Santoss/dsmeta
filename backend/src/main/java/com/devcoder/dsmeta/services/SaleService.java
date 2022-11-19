package com.devcoder.dsmeta.services;

import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devcoder.dsmeta.entities.Sale;
import com.devcoder.dsmeta.repositories.SaleRepository;

@Service // Registra o SaleService como sendo um componente do sistema
public class SaleService { 
	
	@Autowired // Importa automaticamente
	private SaleRepository repository;
	
	public List<Sale> findSales() { // Retorna uma lista de vendas
		return repository.findAll();  // Busca todas as vendas  no banco de dados		
	}
}