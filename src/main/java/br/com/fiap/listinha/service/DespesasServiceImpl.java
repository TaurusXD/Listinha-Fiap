package br.com.fiap.listinha.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.fiap.listinha.dto.DespesaDTO;
import br.com.fiap.listinha.dto.NovaDespesaDTO;
import br.com.fiap.listinha.dto.NovoValorDTO;
import br.com.fiap.listinha.entity.Despesa;
import br.com.fiap.listinha.repository.DespesaRepository;

@Service
public class DespesasServiceImpl implements DespesasService {
	
	private DespesaRepository despesaRepository;

	public DespesasServiceImpl(DespesaRepository despesaRepository) {
		this.despesaRepository = despesaRepository;
	}
	@Override
	public List<DespesaDTO> listarDespesas(String categoria) {
		List<Despesa> DespesaList;
		if(categoria == null) {
			DespesaList = despesaRepository.findAll();
		} else { 
			DespesaList = despesaRepository.findAllByCategoriaLike(categoria);
		}
		return DespesaList
				.stream()
				.map(DespesaDTO::new)
				.collect(Collectors.toList());
	}

	@Override
	public DespesaDTO buscarDespesaPorId(String id) {
		Despesa despesa = getDespesaById(id);
		return new DespesaDTO(Despesa);
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
