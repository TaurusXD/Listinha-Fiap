package br.com.fiap.listinha.Repository;

import br.com.fiap.listinha.Entity.DespesaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DespesaRepository extends JpaRepository<DespesaEntity, Integer> {

    List<DespesaEntity> findAllByStatusContainingIgnoreCase(String status);
    DespesaEntity findByName(String name);
    List<DespesaEntity> findAllByCategoriaContainingIgnoreCase(String categoria);
    List<DespesaEntity> findAllByNameContainingIgnoreCase(String name);
}
