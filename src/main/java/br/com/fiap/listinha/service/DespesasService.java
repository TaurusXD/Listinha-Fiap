package br.com.fiap.listinha.service;

import br.com.fiap.listinha.dto.DespesaDTO;
import br.com.fiap.listinha.dto.NovaDespesaDTO;

import java.util.List;

public interface DespesasService {
	List<DespesaDTO> listarDespesas ();
	List<DespesaDTO> listarDespesasPorCategoria (String categoria);
	List<DespesaDTO> buscarDespesasPorNome(String name);

	List<DespesaDTO> buscarDespesasPorStatus(String status);

	DespesaDTO buscarDespesaPorId(Integer id);
	DespesaDTO criar (NovaDespesaDTO novaDespesaDTO);
	DespesaDTO atualizar (Integer id, NovaDespesaDTO novaDespesaDTO);
	DespesaDTO patchDespesa (Integer id, NovaDespesaDTO novaDespesaDTO);
	void deletarDespesa(Integer id);

}
