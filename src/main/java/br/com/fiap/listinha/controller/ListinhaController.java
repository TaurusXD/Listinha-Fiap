package br.com.fiap.listinha.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.fiap.listinha.dto.DespesaDTO;
import br.com.fiap.listinha.dto.NovaDespesaDTO;
import br.com.fiap.listinha.dto.NovoValorDTO;
import br.com.fiap.listinha.service.DespesasService;

@RestController
@RequestMapping("despesas")
public class ListinhaController{
	
	
	private DespesasService despesaService;
	
	public ListinhaController(DespesasService despesaService) {
		this.despesaService = despesaService;
	
	}
	
	@GetMapping 
	public List<DespesaDTO> getDespesas(
			@RequestParam String id
	){
		return despesaService.listarDespesas(id);
	}
	
	@GetMapping("{id}")
	public DespesaDTO getCategoriaById(
			@PathVariable(name = "id") String id
	) {
		return despesaService.buscarDespesaPorId(id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public DespesaDTO createDespesa(
			@RequestBody NovaDespesaDTO novaDespesaDTO
	) {
		return despesaService.criar(novaDespesaDTO);
	}
	
	@PatchMapping("{id}")
	public DespesaDTO updateDespesa(
			@RequestBody NovaDespesaDTO novaDespesaDTO,
			@PathVariable String id
	) {
		return despesaService.atualizar(id, novaDespesaDTO);
	}
	@PutMapping ("{id}")
	public DespesaDTO updateValorDaDespesa(
			@RequestBody NovoValorDTO novoValorDTO,
			@PathVariable String id
	) {
		
		return despesaService.atualizarPreco(id, novoValorDTO);
	}
	@DeleteMapping("{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteDespesa(
			@PathVariable String id
	) {
		despesaService.deletarDespesa(id);
	}
}
