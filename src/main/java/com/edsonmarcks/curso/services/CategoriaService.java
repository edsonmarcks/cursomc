package com.edsonmarcks.curso.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edsonmarcks.curso.domain.Categoria;
import com.edsonmarcks.curso.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> categoria = repo.findById(id);
		//retorna o objeto ou nulo
		return categoria.orElse(null);
	}
}
