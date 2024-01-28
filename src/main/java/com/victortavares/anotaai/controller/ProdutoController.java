package com.victortavares.anotaai.controller;

import com.victortavares.anotaai.domain.produto.ProdutoInsertDTO;
import com.victortavares.anotaai.domain.produto.ProdutoListDTO;
import com.victortavares.anotaai.domain.produto.ProdutoUpdateDTO;
import com.victortavares.anotaai.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<ProdutoListDTO> insert(@RequestBody @Valid ProdutoInsertDTO produtoDto) {
        var produto = new ProdutoListDTO(produtoService.insert(produtoDto));
        return ResponseEntity.ok().body(produto);
    }

    @GetMapping
    public ResponseEntity<List<ProdutoListDTO>> list() {
        var produtos = produtoService.findAll()
                .stream()
                .map(ProdutoListDTO::new)
                .toList();

        return ResponseEntity.ok().body(produtos);
    }

    @RequestMapping(method = {RequestMethod.PUT, RequestMethod.PATCH})
    public ResponseEntity<ProdutoListDTO> update(@RequestBody @Valid ProdutoUpdateDTO produtoDto) {
        var produto = new ProdutoListDTO(produtoService.update(produtoDto));
        return ResponseEntity.ok().body(produto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable String id) {
        produtoService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
