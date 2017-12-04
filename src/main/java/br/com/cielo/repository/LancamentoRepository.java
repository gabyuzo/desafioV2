package br.com.cielo.repository;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.cielo.domain.raw.RawResult;

/**
 * @author gishikawa
 *
 */
@Component
public class LancamentoRepository {

    /**
     * @return
     * @throws IOException
     * @throws JsonMappingException
     * @throws JsonParseException
     */
    public RawResult getVendas() throws JsonParseException, JsonMappingException, IOException {
        File file = new File("lancamento-conta-legado.json");
        Scanner scanner = new Scanner(file);
        String json = scanner.nextLine();

        while (scanner.hasNext()) {
            json += scanner.nextLine();
        }
        scanner.close();
        return rawResultBuider(json);
    }
    
    private RawResult rawResultBuider(String json) throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, RawResult.class);
    }

}
