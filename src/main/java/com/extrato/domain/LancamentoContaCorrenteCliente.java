package com.extrato.domain;

/**
 * @author gishikawa
 *
 */
public class LancamentoContaCorrenteCliente {

    private final String dataLancamento;

    private final String dataConfirmacao;

    private final String descricao;

    private final long numero;

    private final String situacao;

    private final String valor;

    private final String nomeBanco;

    private final Bank dadosBanco;

    /**
     * @param dataLancamentoContaCorrenteCliente
     * @param dataEfetivaLancamento
     * @param nomeTipoOperacao
     * @param numeroRemessaBanco
     * @param nomeSituacaoRemessa
     * @param valorLancamentoRemessa
     * @param dadosDomicilioBancario
     */
    public LancamentoContaCorrenteCliente(String dataLancamentoContaCorrenteCliente, String dataEfetivaLancamento, String nomeTipoOperacao,
            long numeroRemessaBanco, String nomeSituacaoRemessa, String valorLancamentoRemessa, String nomeBanco, Bank dadosDomicilioBancario) {
        super();
        this.dataLancamento = dataLancamentoContaCorrenteCliente;
        this.dataConfirmacao = dataEfetivaLancamento;
        this.descricao = nomeTipoOperacao;
        this.numero = numeroRemessaBanco;
        this.situacao = nomeSituacaoRemessa;
        this.valor = valorLancamentoRemessa;
        this.nomeBanco = nomeBanco;
        this.dadosBanco = dadosDomicilioBancario;
    }

    public String getdataLancamento() {
        return dataLancamento;
    }

    public String getdataConfirmacao() {
        return dataConfirmacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public long getNumero() {
        return numero;
    }

    public String getSituacao() {
        return situacao;
    }

    public String getValor() {
        return valor;
    }

    public Bank getDadosBanc() {
        return dadosBanco;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

}
