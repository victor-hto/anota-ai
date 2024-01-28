package com.victortavares.anotaai.domain.produto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProdutoInsertDTO(
        @NotBlank
        String title,
        @NotBlank
        String description,
        @NotBlank
        String ownerId,
        @NotNull
        BigDecimal price,
        @NotBlank
        String categoryId
) {
}
