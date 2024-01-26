package com.victortavares.anotaai.domain.produto;

import com.victortavares.anotaai.domain.categoria.Categoria;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Getter
@NoArgsConstructor
@Document(collection = "produtos")
public class Produto {

    @Id
    private String id;
    private String title;
    private String description;
    private String ownedId;
    private BigDecimal price;
    private Categoria category;
}
