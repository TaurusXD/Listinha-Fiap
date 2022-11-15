package br.com.fiap.listinha.Repository;

import br.com.fiap.listinha.Entity.DespesaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DespesaRepository extends JpaRepository<DespesaEntity, Integer> {


}
