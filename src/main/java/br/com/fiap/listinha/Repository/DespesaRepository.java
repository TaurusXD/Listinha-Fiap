package br.com.fiap.listinha.Repository;

import br.com.fiap.listinha.Entity.DespesaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DespesaRepository extends JpaRepository<DespesaEntity, Integer> {

    List<DespesaEntity> findAllByNameContaining(String categoria);
    @Query(value = "from DespesaEntity where categoria like :categoria")
    List<DespesaEntity> listarPorCategoria(String categoria);

    @Query(value = "from DespesaEntity where id like :id")
    List<DespesaEntity> listarPorId(Integer id);

}
