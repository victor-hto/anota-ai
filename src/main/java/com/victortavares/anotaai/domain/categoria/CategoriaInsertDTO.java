package com.victortavares.anotaai.domain.categoria;

import jakarta.validation.constraints.NotBlank;

public record CategoriaInsertDTO(
        @NotBlank
        String title,
        @NotBlank
        String description,
        @NotBlank
        String ownerId

) {
}
