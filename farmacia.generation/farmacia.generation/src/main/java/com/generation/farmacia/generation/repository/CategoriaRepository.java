package com.generation.farmacia.generation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.farmacia.generation.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
 
	//public List<Categoria> finalAllCategoria (String nome);
	//public List<Categoria> finalByIDCategoria (Long id);
	//public List<Categoria> finalByDescricaoCategoria (String descricao);
	public List<Categoria> findAllByTipoContainingIgnoreCase (String tipo);
}
