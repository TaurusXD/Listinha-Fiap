package br.com.fiap.listinha.service;

import br.com.fiap.listinha.dto.DespesaDTO;
import br.com.fiap.listinha.dto.NovaDespesaDTO;
import br.com.fiap.listinha.dto.NovoValorDTO;

import java.util.List;

public interface DespesasService {
	List<DespesaDTO> listarDespesas (Integer id);
	List<DespesaDTO> listarDespesasPorCategoria (String categoria);
	DespesaDTO buscarDespesaPorId(Integer id);
	DespesaDTO criar (NovaDespesaDTO novaDespesaDTO);
	DespesaDTO atualizar (Integer id, NovaDespesaDTO novaDespesaDTO);
	DespesaDTO atualizarPreco (Integer id, NovoValorDTO novaDespesaDTO);
	void deletarDespesa(Integer id);

}
