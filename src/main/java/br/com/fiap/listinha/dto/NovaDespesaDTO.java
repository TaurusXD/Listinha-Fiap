package br.com.fiap.listinha.dto;

import java.math.BigDecimal;
import java.util.Date;

public class NovaDespesaDTO {

    private String name;
    private String categoria;
    private String status;
    private BigDecimal valor;
    private Date dataVencimento;
    private String descricao;

    public NovaDespesaDTO() {

    }
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    public Date getDataVencimento() {
        return dataVencimento;
    }
    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


}
