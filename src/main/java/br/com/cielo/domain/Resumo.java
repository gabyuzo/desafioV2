package br.com.cielo.domain;

/**
 * @author gishikawa
 *
 */
public class Resumo {

    private Long quantidade;

    private Long quantidadeRemessas;

    private Double valorTotal;

    /**
     * @return the quantidade
     */
    public Long getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the quantidadeRemessas
     */
    public Long getQuantidadeRemessas() {
        return quantidadeRemessas;
    }

    /**
     * @param quantidadeRemessas the quantidadeRemessas to set
     */
    public void setQuantidadeRemessas(Long quantidadeRemessas) {
        this.quantidadeRemessas = quantidadeRemessas;
    }

    /**
     * @return the valorTotal
     */
    public Double getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

}
