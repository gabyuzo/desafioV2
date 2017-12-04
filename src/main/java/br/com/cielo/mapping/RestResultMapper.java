/**
 *
 */
package br.com.cielo.mapping;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.social.InternalServerErrorException;

import br.com.cielo.domain.Banco;
import br.com.cielo.domain.Lancamento;
import br.com.cielo.domain.Paginacao;
import br.com.cielo.domain.RestResult;
import br.com.cielo.domain.Resumo;
import br.com.cielo.domain.raw.ListaControleLancamento;
import br.com.cielo.domain.raw.RawResult;

/**
 * @author gishikawa
 *
 */
public class RestResultMapper {

    public static RestResult from(RawResult result) {
        try {
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Paginacao paginacao = new Paginacao();
            paginacao.setPagina(result.getIndice());
            paginacao.setQuantidadeElementos(result.getTotalElements());
            paginacao.setTamanho(result.getTamanhoPagina());

            Resumo resumo = new Resumo();
            resumo.setQuantidade(result.getTotalControleLancamento().getQuantidadeLancamentos());
            resumo.setQuantidadeRemessas(result.getTotalControleLancamento().getQuantidadeRemessas());
            resumo.setValorTotal(result.getTotalControleLancamento().getValorLancamentos());

            List<Lancamento> itens = new ArrayList<>();
            // result.getListaControleLancamento().stream().forEach(item -> {
            
            for (ListaControleLancamento item : result.getListaControleLancamento()) {
                Lancamento lancamento = new Lancamento();
                if (item.getDataLancamentoContaCorrenteCliente() != null) {
                    lancamento.setData(df.parse(item.getDataLancamentoContaCorrenteCliente()));
                }
                if (item.getDataEfetivaLancamento() != null) {
                    lancamento.setDataConfirmacao(df.parse(item.getDataEfetivaLancamento()));
                }
                lancamento.setDescricao(item.getLancamentoContaCorrenteCliente().getNomeTipoOperacao());
                lancamento.setNumero(item.getLancamentoContaCorrenteCliente().getNumeroRemessaBanco());
                lancamento.setSituacao(item.getLancamentoContaCorrenteCliente().getNomeSituacaoRemessa());
                lancamento.setValor(item.getValorLancamentoRemessa());

                Banco banco = new Banco();
                banco.setCodigo(item.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getCodigoBanco());
                banco.setAgencia(item.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getNumeroAgencia());
                banco.setContaCorrente(item.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getNumeroContaCorrente());
                banco.setNome(item.getNomeBanco().trim());

                lancamento.setDadosBancarios(banco);
                itens.add(lancamento);
            }
            // });

            RestResult restResult = new RestResult();
            restResult.setResumo(resumo);
            restResult.setPaginacao(paginacao);
            restResult.setItens(itens);

            return restResult;
        } catch (Exception e) {
            System.out.println(e);
            throw new InternalServerErrorException("ER001", "ocorreu um erro durante a validação dos dados");
        }
    }

}
