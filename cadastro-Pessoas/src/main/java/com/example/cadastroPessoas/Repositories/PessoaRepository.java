package com.example.cadastroPessoas.Repositories;

import com.example.cadastroPessoas.Entities.Pessoa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
