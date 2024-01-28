package com.victortavares.anotaai.service;

import com.victortavares.anotaai.domain.categoria.Categoria;
import com.victortavares.anotaai.domain.categoria.CategoriaInsertDTO;
import com.victortavares.anotaai.domain.categoria.CategoriaNotFoundException;
import com.victortavares.anotaai.domain.categoria.CategoriaUpdateDTO;
import com.victortavares.anotaai.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;


    public Categoria insert(CategoriaInsertDTO categoriaDto) {
        var categoria = new Categoria(categoriaDto);
        return repository.save(categoria);
    }

    public List<Categoria> findAll() {
        var categorias = repository.findAll();
        return categorias;
    }

    public Categoria update(CategoriaUpdateDTO categoriaDto) {
        var categoria = repository.findById(categoriaDto.id())
                .orElseThrow(CategoriaNotFoundException::new);

        categoria.update(categoriaDto);
        repository.save(categoria);

        return categoria;
    }

    public void delete(String id) {
        var categoria = repository.findById(id)
                .orElseThrow(CategoriaNotFoundException::new);

        repository.delete(categoria);
    }

    public Categoria findById(String categoryId) {
        var categoria = repository.findById(categoryId)
                .orElseThrow(CategoriaNotFoundException::new);

        return categoria;

    }
}
