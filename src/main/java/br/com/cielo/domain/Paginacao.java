package br.com.cielo.domain;

/**
 * @author gishikawa
 *
 */
public class Paginacao {

    private Integer pagina;

    private Integer tamanho;

    private Long quantidadeElementos;

    /**
     * @return the pagina
     */
    public Integer getPagina() {
        return pagina;
    }

    /**
     * @param pagina the pagina to set
     */
    public void setPagina(Integer pagina) {
        this.pagina = pagina;
    }

    /**
     * @return the tamanho
     */
    public Integer getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * @return the quantidadeElementos
     */
    public Long getQuantidadeElementos() {
        return quantidadeElementos;
    }

    /**
     * @param quantidadeElementos the quantidadeElementos to set
     */
    public void setQuantidadeElementos(Long quantidadeElementos) {
        this.quantidadeElementos = quantidadeElementos;
    }

}
