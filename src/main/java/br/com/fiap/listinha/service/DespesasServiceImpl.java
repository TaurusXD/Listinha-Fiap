package br.com.fiap.listinha.service;

import br.com.fiap.listinha.Entity.DespesaEntity;
import br.com.fiap.listinha.Repository.DespesaRepository;
import br.com.fiap.listinha.dto.DespesaDTO;
import br.com.fiap.listinha.dto.NovaDespesaDTO;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
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
	public List<DespesaDTO> listarDespesas() {
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
					dto.setValor(entity.getValor());
					dto.setDataVencimento(entity.getDataVencimento());
					dto.setDescricao(entity.getDescricao());
					return dto;
				}).collect(Collectors.toList());
	}

	//@Override
	public List<DespesaDTO> listarDespesasPorCategoria(String categoria) {
		List<DespesaEntity> DespesaList;
		DespesaList = despesaRepository.findAllByCategoriaContainingIgnoreCase(categoria);
		return DespesaList
				.stream()
				.map(entity ->{
					DespesaDTO dto = new DespesaDTO();
					dto.setId(entity.getId());
					dto.setName(entity.getName());
					dto.setCategoria(entity.getCategoria());
					dto.setStatus(entity.getStatus());
					dto.setValor(entity.getValor());
					dto.setDataVencimento(entity.getDataVencimento());
					dto.setDescricao(entity.getDescricao());
					return dto;
				}).collect(Collectors.toList());
	}

	@Override
	public List<DespesaDTO> buscarDespesasPorNome(String name) {
			List<DespesaEntity> DespesaList;
			DespesaList = despesaRepository.findAllByNameContainingIgnoreCase(name);
			return DespesaList
					.stream()
					.map(entity ->{
						DespesaDTO dto = new DespesaDTO();
						dto.setId(entity.getId());
						dto.setName(entity.getName());
						dto.setCategoria(entity.getCategoria());
						dto.setStatus(entity.getStatus());
						dto.setValor(entity.getValor());
						dto.setDataVencimento(entity.getDataVencimento());
						dto.setDescricao(entity.getDescricao());
						return dto;
					}).collect(Collectors.toList());
		}
	@Override
	public List<DespesaDTO> buscarDespesasPorStatus(String status) {
		List<DespesaEntity> DespesaList;
		DespesaList = despesaRepository.findAllByStatusContainingIgnoreCase(status);
		return DespesaList
				.stream()
				.map(entity ->{
					DespesaDTO dto = new DespesaDTO();
					dto.setId(entity.getId());
					dto.setName(entity.getName());
					dto.setCategoria(entity.getCategoria());
					dto.setStatus(entity.getStatus());
					dto.setValor(entity.getValor());
					dto.setDataVencimento(entity.getDataVencimento());
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
		dto.setValor(entity.getValor());
		dto.setDataVencimento(entity.getDataVencimento());
		dto.setDescricao(entity.getDescricao());
		return dto;
	}

	@Override
	public DespesaDTO criar(NovaDespesaDTO novaDespesaDTO) {
		DespesaEntity entity = new DespesaEntity();
		entity.setName((novaDespesaDTO.getName()));
		entity.setCategoria(novaDespesaDTO.getCategoria());
		entity.setStatus(novaDespesaDTO.getStatus());
		entity.setValor(novaDespesaDTO.getValor());
		entity.setDataVencimento(novaDespesaDTO.getDataVencimento());
		entity.setDescricao(novaDespesaDTO.getDescricao());

		DespesaEntity savedEntity = despesaRepository.save(entity);

		DespesaDTO dto = new DespesaDTO();
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		dto.setCategoria(entity.getCategoria());
		dto.setStatus(entity.getStatus());
		dto.setValor(entity.getValor());
		dto.setDataVencimento(entity.getDataVencimento());
		dto.setDescricao(entity.getDescricao());
		return dto;
	}
	@Override
	public DespesaDTO atualizar(Integer id, NovaDespesaDTO novaDespesaDTO) {
		DespesaEntity entity = despesaRepository.findById(id)
				.orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
		entity.setName((novaDespesaDTO.getName()));
		entity.setCategoria(novaDespesaDTO.getCategoria());
		entity.setStatus(novaDespesaDTO.getStatus());
		entity.setValor(novaDespesaDTO.getValor());
		entity.setDataVencimento(novaDespesaDTO.getDataVencimento());
		entity.setDescricao(novaDespesaDTO.getDescricao());

		DespesaEntity savedEntity = despesaRepository.save(entity);

		DespesaDTO dto = new DespesaDTO();
		dto.setId(savedEntity.getId());
		dto.setName(savedEntity.getName());
		dto.setCategoria(savedEntity.getCategoria());
		dto.setStatus(savedEntity.getStatus());
		dto.setValor(savedEntity.getValor());
		dto.setDataVencimento(savedEntity.getDataVencimento());
		dto.setDescricao(savedEntity.getDescricao());
		return dto;
	}

	@Override
	public DespesaDTO patchDespesa(Integer id, NovaDespesaDTO novaDespesaDTO) {
		DespesaEntity entity = despesaRepository.findById(id)
				.orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
		if(null != novaDespesaDTO.getName()){
		entity.setName((novaDespesaDTO.getName()));
		}
		if(null != novaDespesaDTO.getCategoria()) {
			entity.setCategoria(novaDespesaDTO.getCategoria());
		}
		if(null != novaDespesaDTO.getStatus()) {
			entity.setStatus(novaDespesaDTO.getStatus());
		}
		if(null != novaDespesaDTO.getValor()) {
			entity.setValor(novaDespesaDTO.getValor());
		}
		if(null != novaDespesaDTO.getDataVencimento()) {
			entity.setDataVencimento(novaDespesaDTO.getDataVencimento());
		}
		if(null != novaDespesaDTO.getDescricao()) {
			entity.setDescricao(novaDespesaDTO.getDescricao());
		}
		DespesaEntity savedEntity = despesaRepository.save(entity);

		DespesaDTO dto = new DespesaDTO();
		dto.setId(savedEntity.getId());
		dto.setName(savedEntity.getName());
		dto.setCategoria(savedEntity.getCategoria());
		dto.setStatus(savedEntity.getStatus());
		dto.setValor(savedEntity.getValor());
		dto.setDataVencimento(savedEntity.getDataVencimento());
		dto.setDescricao(savedEntity.getDescricao());
		return dto;
	}

	@Override
	public void deletarDespesa(Integer id) {
		despesaRepository.deleteById(id);
		
	}

}
