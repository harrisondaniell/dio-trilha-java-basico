package com.github.contaspagar.servico;

import com.github.pagamento.DocumentoPagavel;
import com.github.pagamento.MetodoPagamento;

public class ServicoContaPagar {

    private MetodoPagamento metodoPagamento;

    public ServicoContaPagar(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void pagar(DocumentoPagavel documento) {
        metodoPagamento.pagar(documento);
    }
}
