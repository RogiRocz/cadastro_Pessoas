package com.example.cadastroPessoas.Controllers;

import java.util.List;

import com.example.cadastroPessoas.Entities.Pessoas;
import com.example.cadastroPessoas.Services.PessoasService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoasController {
    private final PessoasService pessoasService;

    public PessoasController(PessoasService pessoasService) {
        this.pessoasService = pessoasService;
    }

    @GetMapping
    public List<Pessoas> findAll() {
        return pessoasService.findAll();
    }

    @PostMapping
    public void insert(@RequestBody Pessoas pessoa) {
        pessoasService.insert(pessoa);
    }

    @DeleteMapping(path = "{id}")
    public void delete(@PathVariable("id") Long id) {
        pessoasService.delete(id);
    }
}
