package br.com.cielo.domain;

import java.util.Date;

/**
 * @author gishikawa
 *
 */
public class Lancamento {

    private Date data;

    private Date dataConfirmacao;

    private String descricao;

    private Long numero;

    private String situacao;

    private Banco dadosBancarios;

    private Double valor;

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the dataConfirmacao
     */
    public Date getDataConfirmacao() {
        return dataConfirmacao;
    }

    /**
     * @param dataConfirmacao the dataConfirmacao to set
     */
    public void setDataConfirmacao(Date dataConfirmacao) {
        this.dataConfirmacao = dataConfirmacao;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the numero
     */
    public Long getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Long numero) {
        this.numero = numero;
    }

    /**
     * @return the situacao
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    /**
     * @return the dadosBancarios
     */
    public Banco getDadosBancarios() {
        return dadosBancarios;
    }

    /**
     * @param dadosBancarios the dadosBancarios to set
     */
    public void setDadosBancarios(Banco dadosBancarios) {
        this.dadosBancarios = dadosBancarios;
    }
    
    /**
     * @return the valor
     */
    public Double getValor() {
        return valor;
    }
    
    /**
     * @param valor the valor to set
     */
    public void setValor(Double valor) {
        this.valor = valor;
    }
    
}
