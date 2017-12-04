/**
 *
 */
package br.com.cielo.domain.raw;

import java.util.List;

/**
 * @author gishikawa
 *
 */
public class RawResult {
    
    private List<ListaControleLancamento> listaControleLancamento;

    private TotalControleLancamento totalControleLancamento;

    private Integer indice;

    private Integer tamanhoPagina;

    private Long totalElements;
    
    /**
     * @return the listaControleLancamento
     */
    public List<ListaControleLancamento> getListaControleLancamento() {
        return listaControleLancamento;
    }
    
    /**
     * @param listaControleLancamento the listaControleLancamento to set
     */
    public void setListaControleLancamento(List<ListaControleLancamento> listaControleLancamento) {
        this.listaControleLancamento = listaControleLancamento;
    }
    
    /**
     * @return the totalControleLancamento
     */
    public TotalControleLancamento getTotalControleLancamento() {
        return totalControleLancamento;
    }
    
    /**
     * @param totalControleLancamento the totalControleLancamento to set
     */
    public void setTotalControleLancamento(TotalControleLancamento totalControleLancamento) {
        this.totalControleLancamento = totalControleLancamento;
    }
    
    /**
     * @return the indice
     */
    public Integer getIndice() {
        return indice;
    }
    
    /**
     * @param indice the indice to set
     */
    public void setIndice(Integer indice) {
        this.indice = indice;
    }
    
    /**
     * @return the tamanhoPagina
     */
    public Integer getTamanhoPagina() {
        return tamanhoPagina;
    }
    
    /**
     * @param tamanhoPagina the tamanhoPagina to set
     */
    public void setTamanhoPagina(Integer tamanhoPagina) {
        this.tamanhoPagina = tamanhoPagina;
    }
    
    /**
     * @return the totalElements
     */
    public Long getTotalElements() {
        return totalElements;
    }
    
    /**
     * @param totalElements the totalElements to set
     */
    public void setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
    }
    
}
