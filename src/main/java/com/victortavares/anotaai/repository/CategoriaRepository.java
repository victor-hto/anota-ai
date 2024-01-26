package com.victortavares.anotaai.repository;

import com.victortavares.anotaai.domain.categoria.Categoria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends MongoRepository<Categoria, String> {
}
