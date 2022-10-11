package br.com.fiap.listinha.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.fiap.listinha.dto.DespesaDTO;
import br.com.fiap.listinha.dto.NovaDespesaDTO;
import br.com.fiap.listinha.dto.NovoValorDTO;

@Service
public class DespesasServiceImpl implements DespesasService {

	@Override
	public List<DespesaDTO> listarDespesas(String tipo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DespesaDTO buscarDespesaPorId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DespesaDTO criar(NovaDespesaDTO novaDespesaDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DespesaDTO atualizar(String id, NovaDespesaDTO novaDespesaDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DespesaDTO atualizarPreco(String id, NovoValorDTO novaDespesaDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletarDespesa(String id) {
		// TODO Auto-generated method stub
		
	}

}
