package br.com.fiap.listinha.service;

import br.com.fiap.listinha.dto.DespesaDTO;
import br.com.fiap.listinha.dto.NovaDespesaDTO;
import br.com.fiap.listinha.dto.NovoValorDTO;

import java.util.List;

public interface DespesasService {
	List<DespesaDTO> listarDespesas (String id);
	List<DespesaDTO> list(String id);
	DespesaDTO buscarDespesaPorId(String id);
	DespesaDTO criar (NovaDespesaDTO novaDespesaDTO);
	DespesaDTO atualizar (String id, NovaDespesaDTO novaDespesaDTO);
	DespesaDTO atualizarPreco (String id, NovoValorDTO novaDespesaDTO);
	void deletarDespesa(String id);

}
