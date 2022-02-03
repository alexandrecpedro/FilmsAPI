package com.digitalhouse.FilmsAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitalhouse.FilmsAPI.model.Filme;
import com.digitalhouse.FilmsAPI.service.FilmeService;

@RestController
@RequestMapping("/filme")
@CrossOrigin(origins = "*", allowedHeaders = "")
public class FilmeController {

    @Autowired
    private FilmeService service;
    
    @GetMapping
    public List<Filme> selectAll(){
        return service.selectAll();
    }
    
    @GetMapping("/{id}")
    public Filme selectById(@PathVariable Integer id){
        return service.select(id);
    }
    
    @DeleteMapping("/{id}")
    public String post(@PathVariable Integer id){
        service.delete(id);
        return "Filme deletado com sucesso";
    }

    @PostMapping
    public Filme post(@RequestBody Filme filme){
        return service.create(filme);
    }

    @PutMapping
    public Filme put(@RequestBody Filme filme){
        return service.editar(filme);
    }

    
}