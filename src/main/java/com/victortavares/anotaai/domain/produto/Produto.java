package com.victortavares.anotaai.domain.produto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.json.JSONObject;
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
    private String ownerId;
    private BigDecimal price;
    private String categoryId;

    public Produto(ProdutoInsertDTO produtoDTO) {
        this.title = produtoDTO.title();
        this.description = produtoDTO.description();
        this.ownerId = produtoDTO.ownerId();
        this.price = produtoDTO.price();
        this.categoryId = produtoDTO.categoryId();
    }

    public void update(ProdutoUpdateDTO produtoDto) {
        this.title = produtoDto.title() == null ? this.title : produtoDto.title();
        this.description = produtoDto.description() == null ? this.description : produtoDto.description();
        this.ownerId = produtoDto.ownerId() == null ? this.ownerId : produtoDto.ownerId();
        this.price = produtoDto.price() == null ? this.price : produtoDto.price();
        this.categoryId = produtoDto.categoryId() == null ? this.categoryId : produtoDto.categoryId();
    }

    @Override
    public String toString() {
        JSONObject json = new JSONObject();
        json.put("id", id);
        json.put("title", title);
        json.put("description", description);
        json.put("ownerId", ownerId);
        json.put("price", price);
        json.put("categoryId", categoryId);
        json.put("type", "produto");

        return json.toString();
    }
}
