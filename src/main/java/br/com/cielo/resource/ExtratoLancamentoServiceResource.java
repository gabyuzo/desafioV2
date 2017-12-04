package br.com.cielo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cielo.domain.RestResult;
import br.com.cielo.service.ExtratoLancamentoService;

/**
 * @author gishikawa
 *
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/vendas")
public class ExtratoLancamentoServiceResource {

    @Autowired
    private transient ExtratoLancamentoService extratoLancamentoService;

    @RequestMapping(value = "/lancamentos", method = RequestMethod.GET)
    public RestResult findSales() {
        return this.extratoLancamentoService.findSales();
    }

}
