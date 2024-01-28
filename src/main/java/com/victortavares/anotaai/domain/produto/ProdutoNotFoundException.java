package com.victortavares.anotaai.domain.produto;

import com.victortavares.anotaai.config.infra.ValidacaoException;

public class ProdutoNotFoundException extends ValidacaoException {
    public ProdutoNotFoundException() {
        super("Produto não encontrado!");
    }
}
