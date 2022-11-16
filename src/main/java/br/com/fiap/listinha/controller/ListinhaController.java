package br.com.fiap.listinha.controller;

import br.com.fiap.listinha.dto.DespesaDTO;
import br.com.fiap.listinha.dto.NovaDespesaDTO;
import br.com.fiap.listinha.dto.NovoValorDTO;
import br.com.fiap.listinha.service.DespesasService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("despesas")
public class ListinhaController{
	
	
	private DespesasService despesaService;
	
	public ListinhaController(DespesasService despesaService) {
		this.despesaService = despesaService;
	
	}
	
	@GetMapping
	public List<DespesaDTO> getDespesas(
			@RequestParam Integer id
	){
		return despesaService.listarDespesas(id);
	}

	@GetMapping("{id}")
	public DespesaDTO listarDespesasPorCategoria(
			@PathVariable(name = "categoria") String categoria
	) {
		return (DespesaDTO) despesaService.listarDespesasPorCategoria(categoria);
	}


	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public DespesaDTO createDespesa(
			@RequestBody NovaDespesaDTO novaDespesaDTO
	) {
		return despesaService.criar(novaDespesaDTO);
	}
	
	@PatchMapping("{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public DespesaDTO updateDespesa(
			@RequestBody NovaDespesaDTO novaDespesaDTO,
			@PathVariable Integer id
	) {
		return despesaService.atualizar(id, novaDespesaDTO);
	}
	@PutMapping ("{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public DespesaDTO updateValorDaDespesa(
			@RequestBody NovoValorDTO novoValorDTO,
			@PathVariable Integer id
	) {
		
		return despesaService.atualizarPreco(id, novoValorDTO);
	}
	@DeleteMapping("{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteDespesa(
			@PathVariable Integer id
	) {
		despesaService.deletarDespesa(id);
	}
}
