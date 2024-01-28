package com.victortavares.anotaai.domain.categoria;

public record CategoriaListDTO(
        String id,
        String title,
        String description,
        String ownerId
) {

    public CategoriaListDTO(Categoria categoria) {
        this(categoria.getId(), categoria.getTitle(), categoria.getDescription(), categoria.getOwnerId());
    }
}
