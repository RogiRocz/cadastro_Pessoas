package com.example.cadastroPessoas.Services;

import java.util.List;

import com.example.cadastroPessoas.Entities.Pessoa;

import com.example.cadastroPessoas.Repositories.PessoaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PesssoaService {

    private final PessoaRepository pessoasRepository;

    @Autowired
    public PesssoaService(PessoaRepository pessoasRepository) {
        this.pessoasRepository = pessoasRepository;
    }

    public List<Pessoa> allPessoas() {
        return pessoasRepository.findAll();
    }

    public void insert(Pessoa pessoa) {
        pessoasRepository.save(pessoa);
    }

    public void delete(Long id) {
        pessoasRepository.deleteById(id);
    }
}
