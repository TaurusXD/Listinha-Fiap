package br.com.fiap.listinha.service;

import br.com.fiap.listinha.Entity.DespesaEntity;
import br.com.fiap.listinha.Repository.DespesaRepository;
import br.com.fiap.listinha.dto.DespesaDTO;
import br.com.fiap.listinha.dto.NovaDespesaDTO;
import br.com.fiap.listinha.dto.NovoValorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DespesasServiceImpl implements DespesasService {
	private DespesaRepository despesaRepository;
	public DespesasServiceImpl(DespesaRepository despesaRepository) {
		this.despesaRepository = despesaRepository;
	}

	@Override
	public List<DespesaDTO> listarDespesas(@RequestParam(required =false) Integer id) {
		List<DespesaEntity> DespesaList;
		DespesaList = despesaRepository.findAll();
		return DespesaList
				.stream()
				.map(entity ->{
					DespesaDTO dto = new DespesaDTO();
					dto.setName(entity.getName());
					dto.setId(entity.getId());
					dto.setCategoria(entity.getCategoria());
					dto.setStatus(entity.getStatus());
					dto.setDataVencimento(entity.getDataVencimento());
					dto.setValor(entity.getValor());
					dto.setDescricao(entity.getDescricao());
					return dto;
				}).collect(Collectors.toList());
	}

	//@Override
	public List<DespesaDTO> listarDespesasPorCategoria(String categoria) {
		List<DespesaEntity> DespesaList;
		DespesaList = despesaRepository.findAll();
		return DespesaList
				.stream()
				.map(entity ->{
					DespesaDTO dto = new DespesaDTO();
					dto.setId(entity.getId());
					dto.setName(entity.getName());
					dto.setCategoria(entity.getCategoria());
					dto.setStatus(entity.getStatus());
					dto.setDataVencimento(entity.getDataVencimento());
					dto.setValor(entity.getValor());
					dto.setDescricao(entity.getDescricao());
					return dto;
				}).collect(Collectors.toList());
	}

	@Override
	public DespesaDTO buscarDespesaPorId(Integer id) {
		DespesaEntity entity = despesaRepository.findById(id)
				.orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
		DespesaDTO dto = new DespesaDTO();
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		dto.setCategoria(entity.getCategoria());
		dto.setStatus(entity.getStatus());
		dto.setDataVencimento(entity.getDataVencimento());
		dto.setValor(entity.getValor());
		dto.setDescricao(entity.getDescricao());
		return dto;
	}

	/*
	@Override
	public DespesaDTO buscarDespesaPorId(Integer id) {
		Despesa despesa = getDespesaById(id);
		return new DespesaDTO(Despesa);
	}
	*/

	@Override
	public DespesaDTO criar(NovaDespesaDTO novaDespesaDTO) {
		DespesaEntity entity = new DespesaEntity();
		entity.setName((novaDespesaDTO.getName()));
		entity.setCategoria(novaDespesaDTO.getDescricao());
		entity.setDataVencimento(novaDespesaDTO.getDataVencimento());
		entity.setStatus(novaDespesaDTO.getStatus());
		entity.setValor(novaDespesaDTO.getValor());
		entity.setDescricao(novaDespesaDTO.getDescricao());

		DespesaEntity savedEntity = despesaRepository.save(entity);

		DespesaDTO dto = new DespesaDTO();
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		dto.setCategoria(entity.getCategoria());
		dto.setStatus(entity.getStatus());
		dto.setDataVencimento(entity.getDataVencimento());
		dto.setValor(entity.getValor());
		dto.setDescricao(entity.getDescricao());
		return dto;
	}
	@Override
	public DespesaDTO atualizar(Integer id, NovaDespesaDTO novaDespesaDTO) {
		DespesaEntity entity = despesaRepository.findById(id)
				.orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
		entity.setCategoria(novaDespesaDTO.getDescricao());
		entity.setDataVencimento(novaDespesaDTO.getDataVencimento());
		entity.setStatus(novaDespesaDTO.getStatus());
		entity.setValor(novaDespesaDTO.getValor());
		entity.setDescricao(novaDespesaDTO.getDescricao());

		DespesaEntity savedEntity = despesaRepository.save(entity);

		DespesaDTO dto = new DespesaDTO();
		dto.setId(entity.getId());
		dto.setCategoria(entity.getCategoria());
		dto.setStatus(entity.getStatus());
		dto.setDataVencimento(entity.getDataVencimento());
		dto.setValor(entity.getValor());
		dto.setDescricao(entity.getDescricao());
		return dto;
	}

	@Override
	public DespesaDTO atualizarPreco(Integer id, NovoValorDTO novaDespesaDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletarDespesa(Integer id) {
		despesaRepository.deleteById(id);
		
	}

}
