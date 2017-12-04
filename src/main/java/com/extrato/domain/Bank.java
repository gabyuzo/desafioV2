package com.extrato.domain;

/**
 * @author gishikawa
 *
 */
public class Bank {

    private final int codigoBanco;

    private final int numeroAgencia;

    private final String numeroContaCorrente;

    /**
     * @param nomeBanco
     * @param codigoBanco
     * @param numeroAgencia
     * @param numeroContaCorrente
     */
    public Bank(int codigoBanco, int numeroAgencia, String numeroContaCorrente) {
        super();
        this.codigoBanco = codigoBanco;
        this.numeroAgencia = numeroAgencia;
        this.numeroContaCorrente = numeroContaCorrente;
    }

    public int getcodigoBanco() {
        return codigoBanco;
    }

    public int getAgencia() {
        return numeroAgencia;
    }

    public String getcontaCorrente() {
        return numeroContaCorrente;
    }

}
