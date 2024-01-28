package com.victortavares.anotaai.domain.produto;

import java.math.BigDecimal;

public record ProdutoUpdateDTO(
        String id,
        String title,
        String description,
        String ownerId,
        BigDecimal price,
        String categoryId
) {
}
