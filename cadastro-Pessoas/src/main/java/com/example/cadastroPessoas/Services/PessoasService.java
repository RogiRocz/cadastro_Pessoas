package com.example.cadastroPessoas.Services;

import com.example.cadastroPessoas.Entities.Pessoas;
import com.example.cadastroPessoas.Repositories.PessoasRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoasService {
    private final PessoasRepository pessoasRepository;

    @Autowired
    public PessoasService(PessoasRepository pessoasRepository) {
        this.pessoasRepository = pessoasRepository;
    }

    public List<Pessoas> findAll() {
        return pessoasRepository.findAll();
    }

    public void insert(Pessoas pessoa) {
        pessoasRepository.save(pessoa);
    }

    public void delete(Long id) {
        pessoasRepository.deleteById(id);
    }
}
