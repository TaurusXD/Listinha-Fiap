package br.com.fiap.listinha.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import br.com.fiap.listinha.entity.Despesa;

public interface DespesaRepository extends JpaRepository<Despesa, Long>{

		List<Despesa> findAllByCategoriaLike(String categoria);
		
		/*
		 * Named Query
		@Query("select d from Despesa d where d.categoria like : categoria ")
		List<Despesa> buscarDespesasPorCategoria(String categoria);
		*/
}
