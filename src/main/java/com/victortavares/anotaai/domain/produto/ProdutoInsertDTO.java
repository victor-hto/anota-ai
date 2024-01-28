package com.victortavares.anotaai.domain.produto;

import java.math.BigDecimal;

public record ProdutoInsertDTO(
        String title,
        String description,
        String ownedId,
        BigDecimal price,
        String categoryId
) {
}
