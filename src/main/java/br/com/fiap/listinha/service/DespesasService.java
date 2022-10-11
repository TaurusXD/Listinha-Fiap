package br.com.fiap.listinha.service;

import java.util.List;

import br.com.fiap.listinha.dto.DespesaDTO;
import br.com.fiap.listinha.dto.NovaDespesaDTO;
import br.com.fiap.listinha.dto.NovoValorDTO;

public interface DespesasService {
	List<DespesaDTO> listarDespesas (String tipo);
	DespesaDTO buscarDespesaPorId(String id);
	DespesaDTO criar (NovaDespesaDTO novaDespesaDTO);
	DespesaDTO atualizar (String id, NovaDespesaDTO novaDespesaDTO);
	DespesaDTO atualizarPreco (String id, NovoValorDTO novaDespesaDTO);
	void deletarDespesa(String id);
}
