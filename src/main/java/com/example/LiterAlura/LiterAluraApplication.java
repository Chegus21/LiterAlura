package com.example.LiterAlura;

import com.example.LiterAlura.principal.Principal;
import com.example.LiterAlura.repositorio.AutorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class LiterAluraApplication implements CommandLineRunner {

	@Autowired
	private AutorRepository autorRepository;

	public static void main(String[] args) {
		SpringApplication.run(LiterAluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(autorRepository);
		principal.muestraElMenu();
	}
}