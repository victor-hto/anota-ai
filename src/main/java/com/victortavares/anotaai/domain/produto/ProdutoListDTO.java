package com.victortavares.anotaai.domain.produto;

import java.math.BigDecimal;

public record ProdutoListDTO(
        String id,
        String title,
        String description,
        String ownedId,
        BigDecimal price,
        String categoryId
) {
    public ProdutoListDTO(Produto produto) {
        this(produto.getId(), produto.getTitle(), produto.getDescription(), produto.getOwnedId(), produto.getPrice(), produto.getCategory().getId());
    }
}
