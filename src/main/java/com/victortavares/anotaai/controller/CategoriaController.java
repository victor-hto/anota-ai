package com.victortavares.anotaai.controller;

import com.victortavares.anotaai.domain.categoria.CategoriaInsertDTO;
import com.victortavares.anotaai.domain.categoria.CategoriaListDTO;
import com.victortavares.anotaai.domain.categoria.CategoriaUpdateDTO;
import com.victortavares.anotaai.service.CategoriaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @PostMapping
    public ResponseEntity<CategoriaListDTO> insert(@RequestBody @Valid CategoriaInsertDTO categoriaDto) {
        var categoria = new CategoriaListDTO(categoriaService.insert(categoriaDto));
        return ResponseEntity.ok().body(categoria);
    }

    @GetMapping
    public ResponseEntity<List<CategoriaListDTO>> list() {
        var categorias = categoriaService.findAll()
                .stream()
                .map(CategoriaListDTO::new)
                .toList();

        return ResponseEntity.ok().body(categorias);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoriaListDTO> findById(@PathVariable String id) {
        var categorias = new CategoriaListDTO(categoriaService.findById(id));
        return ResponseEntity.ok().body(categorias);
    }

    @RequestMapping(method = {RequestMethod.PUT, RequestMethod.PATCH})
    public ResponseEntity<CategoriaListDTO> update(@RequestBody @Valid CategoriaUpdateDTO categoriaDto) {
        var categoria = new CategoriaListDTO(categoriaService.update(categoriaDto));
        return ResponseEntity.ok().body(categoria);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable String id) {
        categoriaService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
