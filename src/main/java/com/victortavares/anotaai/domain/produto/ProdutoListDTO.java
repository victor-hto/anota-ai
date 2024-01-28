package com.victortavares.anotaai.domain.produto;

import java.math.BigDecimal;

public record ProdutoListDTO(
        String id,
        String title,
        String description,
        String ownerId,
        BigDecimal price,
        String categoryId
) {
    public ProdutoListDTO(Produto produto) {
        this(produto.getId(), produto.getTitle(), produto.getDescription(), produto.getOwnerId(), produto.getPrice(), produto.getCategory().getId());
    }
}
