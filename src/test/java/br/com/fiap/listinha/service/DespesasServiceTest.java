package br.com.fiap.listinha.service;

import br.com.fiap.listinha.dto.NovaDespesaDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.util.Date;

class DespesasServiceTest {

    @Test
    void listarDespesas() {
    }

    @Test
    void list() {
    }

    @Test
    void buscarDespesaPorId() {
    }

    @Test
    void criar() {
        //Setup
        DespesasService despesasService = Mockito.mock(DespesasServiceImpl.class);

        NovaDespesaDTO novaDespesaDTO = new NovaDespesaDTO();

        //Mock
        NovaDespesaDTO mockDespesa = new NovaDespesaDTO();
        mockDespesa.setCategoria("Conta de água");
        mockDespesa.setStatus("Pago");
        mockDespesa.setValor(new BigDecimal("76.57"));
        mockDespesa.setDataVencimento(new Date(04-11-2022));
        mockDespesa.setDescricao("Conta de água referente ao mês de Outubro");
       // Mockito.when(despesasService.criar(novaDespesaDTO).thenReturn(mockDespesa);

        //Call
     //   novaDespesaDTO = despesasService.criar(novaDespesaDTO);

        //Assertions
        Assertions.assertEquals("Conta de água",novaDespesaDTO.getCategoria());
    }

    @Test
    void atualizar() {
    }

    @Test
    void patchDespesa() {
    }

    @Test
    void deletarDespesa() {
    }
}