package com.example.cadastroPessoas.Controllers;

import java.util.List;

import com.example.cadastroPessoas.Entities.Pessoa;
import com.example.cadastroPessoas.Services.PesssoaService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private final PesssoaService pessoaService;

    public PessoaController(PesssoaService pesssoaService) {
        this.pessoaService = pesssoaService;
    }

    @GetMapping
    public List<Pessoa> allPessoas() {
        return pessoaService.allPessoas();
    }

    @PostMapping
    public void retorno(@RequestBody String dados) {
        String[] result = dados.split("&");
        String name = result[0].split("=")[1];
        int age = Integer.parseInt(result[1].split("=")[1]);
        Pessoa p = new Pessoa(name, age);
        pessoaService.insert(p);
    }
}
