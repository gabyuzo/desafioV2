package br.com.cielo.domain;

import java.util.List;

public class RestResult {

    private Resumo resumo;

    private Paginacao paginacao;

    private List<Lancamento> itens;

    /**
     * @return the resumo
     */
    public Resumo getResumo() {
        return resumo;
    }

    /**
     * @param resumo the resumo to set
     */
    public void setResumo(Resumo resumo) {
        this.resumo = resumo;
    }

    /**
     * @return the paginacao
     */
    public Paginacao getPaginacao() {
        return paginacao;
    }

    /**
     * @param paginacao the paginacao to set
     */
    public void setPaginacao(Paginacao paginacao) {
        this.paginacao = paginacao;
    }

    /**
     * @return the itens
     */
    public List<Lancamento> getItens() {
        return itens;
    }

    /**
     * @param itens the itens to set
     */
    public void setItens(List<Lancamento> itens) {
        this.itens = itens;
    }

}
