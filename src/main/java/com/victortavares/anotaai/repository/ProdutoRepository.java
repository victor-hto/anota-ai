package com.victortavares.anotaai.repository;

import com.victortavares.anotaai.domain.produto.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends MongoRepository<Produto, String> {
}
