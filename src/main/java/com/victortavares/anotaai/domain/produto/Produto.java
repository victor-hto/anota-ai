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

    public Produto(ProdutoInsertDTO produtoDTO, Categoria categoria) {
        this.title = produtoDTO.title();
        this.description = produtoDTO.description();
        this.ownedId = produtoDTO.ownedId();
        this.price = produtoDTO.price();
        this.category = categoria;
    }

    public void update(ProdutoUpdateDTO produtoDto, Categoria categoria) {
        this.title = produtoDto.title() == null ? this.title : produtoDto.title();
        this.description = produtoDto.description() == null ? this.description : produtoDto.description();
        this.ownedId = produtoDto.ownedId() == null ? this.ownedId : produtoDto.ownedId();
        this.price = produtoDto.price() == null ? this.price : produtoDto.price();
        this.category = categoria == null ? this.category : categoria;
    }
}
