/**
 *
 */
package br.com.cielo.domain.raw;

import java.util.List;

/**
 * @author gishikawa
 *
 */
public class LancamentoContaCorrenteCliente {

    private Long numeroRemessaBanco;
    
    private List<String> dadosAnaliticoLancamentoFinanceiroCliente;

    private String nomeSituacaoRemessa;

    private String nomeTipoOperacao;

    private DadosDomicilioBancario dadosDomicilioBancario;
    
    /**
     * @return the numeroRemessaBanco
     */
    public Long getNumeroRemessaBanco() {
        return numeroRemessaBanco;
    }
    
    /**
     * @param numeroRemessaBanco the numeroRemessaBanco to set
     */
    public void setNumeroRemessaBanco(Long numeroRemessaBanco) {
        this.numeroRemessaBanco = numeroRemessaBanco;
    }
    
    /**
     * @return the dadosAnaliticoLancamentoFinanceiroCliente
     */
    public List<String> getDadosAnaliticoLancamentoFinanceiroCliente() {
        return dadosAnaliticoLancamentoFinanceiroCliente;
    }
    
    /**
     * @param dadosAnaliticoLancamentoFinanceiroCliente the dadosAnaliticoLancamentoFinanceiroCliente to set
     */
    public void setDadosAnaliticoLancamentoFinanceiroCliente(List<String> dadosAnaliticoLancamentoFinanceiroCliente) {
        this.dadosAnaliticoLancamentoFinanceiroCliente = dadosAnaliticoLancamentoFinanceiroCliente;
    }
    
    /**
     * @return the nomeSituacaoRemessa
     */
    public String getNomeSituacaoRemessa() {
        return nomeSituacaoRemessa;
    }
    
    /**
     * @param nomeSituacaoRemessa the nomeSituacaoRemessa to set
     */
    public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
        this.nomeSituacaoRemessa = nomeSituacaoRemessa;
    }
    
    /**
     * @return the nomeTipoOperacao
     */
    public String getNomeTipoOperacao() {
        return nomeTipoOperacao;
    }
    
    /**
     * @param nomeTipoOperacao the nomeTipoOperacao to set
     */
    public void setNomeTipoOperacao(String nomeTipoOperacao) {
        this.nomeTipoOperacao = nomeTipoOperacao;
    }
    
    /**
     * @return the dadosDomicilioBancario
     */
    public DadosDomicilioBancario getDadosDomicilioBancario() {
        return dadosDomicilioBancario;
    }
    
    /**
     * @param dadosDomicilioBancario the dadosDomicilioBancario to set
     */
    public void setDadosDomicilioBancario(DadosDomicilioBancario dadosDomicilioBancario) {
        this.dadosDomicilioBancario = dadosDomicilioBancario;
    }
    
}
