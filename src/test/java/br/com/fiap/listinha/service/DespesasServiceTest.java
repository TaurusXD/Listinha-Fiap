package br.com.fiap.listinha.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.boot.test.context.SpringBootTest;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

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
/*
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
    }*/
}