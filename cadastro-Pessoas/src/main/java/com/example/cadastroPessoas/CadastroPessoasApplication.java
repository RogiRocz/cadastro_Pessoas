package com.example.cadastroPessoas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class }, scanBasePackages = "com.example.Repositories")
public class CadastroPessoasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroPessoasApplication.class, args);
	}

}
