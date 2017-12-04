package com.extrato.domain;

import java.util.List;

public class RestResult {

    private Summary summary;

    private List<LancamentoContaCorrenteCliente> listaControleLancamento;

    public RestResult(Summary summary, List<LancamentoContaCorrenteCliente> listaControleLancamento) {
        this.summary = summary;
        this.listaControleLancamento = listaControleLancamento;
    }

    public Summary getSummary() {
        return summary;
    }

    public List<LancamentoContaCorrenteCliente> getlistaControleLancamento() {
        return listaControleLancamento;
    }

}
