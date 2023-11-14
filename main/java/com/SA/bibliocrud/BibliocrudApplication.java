package com.SA.bibliocrud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.SA.bibliocrud.entities.Usuario;

@SpringBootApplication
public class BibliocrudApplication implements CommandLineRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(BibliocrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Usuario u1 = new Usuario("Luiz", "luiz@teste.com", "Teste1010");
		Usuario u2 = new Usuario("Gio", "gio@teste.com", "123456");

		u1.setNome("Dudu");

		System.out.println("Nome = " + u2.getNome());
	}

};