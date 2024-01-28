package com.victortavares.anotaai.service;

import com.victortavares.anotaai.domain.categoria.Categoria;
import com.victortavares.anotaai.domain.produto.*;
import com.victortavares.anotaai.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    @Autowired
    private CategoriaService categoriaService;

    @Autowired
    private AwsSnsService awsSnsService;


    public Produto insert(ProdutoInsertDTO produtoDTO) {
        var categoria = categoriaService.findById(produtoDTO.categoryId());

        var produto = new Produto(produtoDTO, categoria);
        produto = repository.save(produto);

        awsSnsService.publishCatalogo(produto.getOwnerId());

        return produto;
    }

    public List<Produto> findAll() {
        var produtos = repository.findAll();
        return produtos;
    }

    public Produto update(ProdutoUpdateDTO produtoDto) {
        var produto = repository.findById(produtoDto.id())
                .orElseThrow(ProdutoNotFoundException::new);

        Categoria categoria = null;
        if (produtoDto.categoryId() != null) {
            categoria = categoriaService.findById(produtoDto.categoryId());
        }

        produto.update(produtoDto, categoria);
        repository.save(produto);

        awsSnsService.publishCatalogo(produto.getOwnerId());

        return produto;
    }

    public void delete(String id) {
        var produto = repository.findById(id)
                .orElseThrow(ProdutoNotFoundException::new);

        repository.delete(produto);
    }
}
