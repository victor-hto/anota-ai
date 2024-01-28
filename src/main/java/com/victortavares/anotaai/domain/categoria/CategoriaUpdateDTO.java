package com.victortavares.anotaai.domain.categoria;

import jakarta.validation.constraints.NotBlank;

public record CategoriaUpdateDTO(
        @NotBlank
        String id,
        String title,
        String description,
        String ownerId
) {
}
