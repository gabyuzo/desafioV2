/**
 *
 */
package br.com.cielo.domain.raw;

/**
 * @author gishikawa
 *
 */
public class TotalControleLancamento {

    private Long quantidadeLancamentos;

    private Long quantidadeRemessas;

    private Double valorLancamentos;
    
    /**
     * @return the quantidadeLancamentos
     */
    public Long getQuantidadeLancamentos() {
        return quantidadeLancamentos;
    }
    
    /**
     * @param quantidadeLancamentos the quantidadeLancamentos to set
     */
    public void setQuantidadeLancamentos(Long quantidadeLancamentos) {
        this.quantidadeLancamentos = quantidadeLancamentos;
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
     * @return the valorLancamentos
     */
    public Double getValorLancamentos() {
        return valorLancamentos;
    }
    
    /**
     * @param valorLancamentos the valorLancamentos to set
     */
    public void setValorLancamentos(Double valorLancamentos) {
        this.valorLancamentos = valorLancamentos;
    }
    
}
