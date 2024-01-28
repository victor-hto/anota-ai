package com.victortavares.anotaai.domain.categoria;

public record CategoriaListDTO(
        String id,
        String title,
        String description,
        String ownedId
) {

    public CategoriaListDTO(Categoria categoria) {
        this(categoria.getId(), categoria.getTitle(), categoria.getDescription(), categoria.getOwnedId());
    }
}
