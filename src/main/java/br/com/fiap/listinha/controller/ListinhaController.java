package br.com.fiap.listinha.controller;

import br.com.fiap.listinha.dto.DespesaDTO;
import br.com.fiap.listinha.dto.NovaDespesaDTO;
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
	@ResponseStatus(HttpStatus.OK)
	public List<DespesaDTO> getDespesas(){
		return despesaService.listarDespesas();
	}

	@GetMapping("/categoria/{categoria}")
	@ResponseStatus(HttpStatus.OK)
	public List<DespesaDTO> buscarDespesaPorCategoria(@PathVariable String categoria) {

		return despesaService.listarDespesasPorCategoria(categoria);
	}
	@GetMapping("id/{id}")
	@ResponseStatus(HttpStatus.OK)
	public DespesaDTO buscarDespesaPorId(@RequestParam Integer id) {

		return despesaService.buscarDespesaPorId(id);
	}

	@GetMapping("name/{name}")
	@ResponseStatus(HttpStatus.OK)
	public List<DespesaDTO> buscarDespesasPorNome(@PathVariable String name) {

		return despesaService.buscarDespesasPorNome(name);
	}

	@GetMapping("status/{status}")
	@ResponseStatus(HttpStatus.OK)
	public List<DespesaDTO> buscarDespesasPorStatus(@PathVariable String status) {

		return despesaService.buscarDespesasPorStatus(status);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public DespesaDTO createDespesa(
			@RequestBody NovaDespesaDTO novaDespesaDTO
	) {
		return despesaService.criar(novaDespesaDTO);
	}
	
	@PatchMapping("id/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public DespesaDTO updateDespesa(
			@RequestBody NovaDespesaDTO novaDespesaDTO,
			@PathVariable Integer id
	) {
		return despesaService.patchDespesa(id, novaDespesaDTO);
	}
	@PutMapping ("id/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public DespesaDTO updateDaDespesa(
			@RequestBody NovaDespesaDTO novaDespesaDTO,
			@PathVariable Integer id
	) {
		
		return despesaService.atualizar(id, novaDespesaDTO);
	}
	@DeleteMapping("id/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteDespesa(
			@PathVariable Integer id
	) {
		despesaService.deletarDespesa(id);
	}
}
