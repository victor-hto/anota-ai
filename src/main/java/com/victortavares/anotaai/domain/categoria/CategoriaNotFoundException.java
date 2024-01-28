package com.victortavares.anotaai.domain.categoria;

import com.victortavares.anotaai.config.infra.ValidacaoException;

public class CategoriaNotFoundException extends ValidacaoException {

    public CategoriaNotFoundException() {
        super("Categoria não encontrada!");
    }
}
