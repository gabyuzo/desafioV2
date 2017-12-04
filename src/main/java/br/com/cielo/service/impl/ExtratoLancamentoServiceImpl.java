package br.com.cielo.service.impl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.InternalServerErrorException;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import br.com.cielo.domain.RestResult;
import br.com.cielo.domain.raw.RawResult;
import br.com.cielo.mapping.RestResultMapper;
import br.com.cielo.repository.LancamentoRepository;
import br.com.cielo.service.ExtratoLancamentoService;

/**
 * @author gishikawa
 *
 */
@Component
public class ExtratoLancamentoServiceImpl implements ExtratoLancamentoService {

    @Autowired
    private LancamentoRepository repository;
    
    @Override
    public RestResult findSales() {
        try {
            return populateStatement();
        } catch (Exception e) {
            System.out.println(e);
            throw new InternalServerErrorException("ER001", e.getMessage());
        }
    }
    
    /**
     * @return
     * @throws IOException
     * @throws JsonMappingException
     * @throws JsonParseException
     */
    private RestResult populateStatement() throws JsonParseException, JsonMappingException, IOException {
        RawResult result = this.repository.getVendas();
        return RestResultMapper.from(result);
    }
    
}
