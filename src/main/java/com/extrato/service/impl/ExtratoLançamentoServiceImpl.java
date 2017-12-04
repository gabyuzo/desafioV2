package com.extrato.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.extrato.domain.Bank;
import com.extrato.domain.LancamentoContaCorrenteCliente;
import com.extrato.domain.RestResult;
import com.extrato.domain.Summary;
import com.extrato.service.ExtratoLançamentoService;

/**
 * @author gishikawa
 *
 */
@Component
public class ExtratoLançamentoServiceImpl implements ExtratoLançamentoService {

    @Override
    public RestResult findSales() {
        return populateStatement();
    }

    /**
     * Mocka os dados para retorno para a tela;
     * 
     * @return
     */
    private static RestResult populateStatement() {

        List<LancamentoContaCorrenteCliente> extrato = new ArrayList<>();
        extrato.add(new LancamentoContaCorrenteCliente("03/06/2016", "03/06/2016", "regular", 64320236054L, "Pago", "11499,10", "BANCO ABCD S.A.",
                new Bank(123, 1, "00000000065470")));
        extrato.add(new LancamentoContaCorrenteCliente("02/06/2016", "02/06/2016", "regular", 64320626054L, "Pago", "1960,00", "BANCO ABCD S.A.",
                new Bank(123, 1, "00000000065470")));

        Summary summary = new Summary();

        summary.setQuantidadeLancamentos(100);
        summary.setQuantidadeRemessas(100);
        summary.setValorLancamentos(BigDecimal.valueOf(100));

        RestResult resultado = new RestResult(summary, extrato);
        return resultado;
    }

}
