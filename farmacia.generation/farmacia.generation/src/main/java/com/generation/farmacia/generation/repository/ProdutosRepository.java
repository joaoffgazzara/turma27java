package com.generation.farmacia.generation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.generation.farmacia.generation.model.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Long>{

	//public List<Produtos> findAllProduto ();
	public List<Produtos> findAllByNomeContainingIgnoreCase (String nome);
	//public List<Produtos> findByDescricaoProduto (String descricao);
}
