package com.example.cadastroPessoas.Repositories;

import com.example.cadastroPessoas.Entities.Pessoas;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PessoasRepository extends CrudRepository<Pessoas, Long> {
    List<Pessoas> findAll();

    Pessoas find(String name);
}