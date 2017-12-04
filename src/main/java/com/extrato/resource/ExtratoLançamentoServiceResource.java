package com.extrato.resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.extrato.domain.RestResult;
import com.extrato.service.ExtratoLançamentoService;

/**
 * @author gishikawa
 *
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/extrato")
public class ExtratoLançamentoServiceResource {
    
    @Autowired
    private transient ExtratoLançamentoService extratoLançamentoService;
        
    @RequestMapping(value = "/lancamentos", method = RequestMethod.GET)
    public RestResult findSales() {
        return this.extratoLançamentoService.findSales();
    }

}
