package com.victortavares.anotaai.domain.categoria;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@NoArgsConstructor
@Document(collection = "categorias")
public class Categoria {
    @Id
    private String id;
    private String title;
    private String description;
    private String ownedId;
}
