package br.com.fiap.listinha.service;

import br.com.fiap.listinha.dto.DespesaDTO;
import br.com.fiap.listinha.dto.NovaDespesaDTO;
import br.com.fiap.listinha.dto.NovoValorDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DespesasServiceImpl implements DespesasService {
	/*public DespesasServiceImpl(DespesaRepository despesaRepository) {
		this.despesaRepository = despesaRepository;
	}*/
	//@Override
	/*public List<DespesaDTO> listarDespesas(String categoria) {
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
	}*/

	@Override
	public List<DespesaDTO> listarDespesas(String id) {
		return null;
	}

	@Override
	public List<DespesaDTO> list(String id) {
		return null;
	}

	@Override
	public DespesaDTO buscarDespesaPorId(String id) {
		return null;
	}

	/*
	@Override
	public DespesaDTO buscarDespesaPorId(String id) {
		Despesa despesa = getDespesaById(id);
		return new DespesaDTO(Despesa);
	}
	*/

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
