package com.dev.backend;

import com.dev.backend.entity.Estado;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {

		SpringApplication.run(BackendApplication.class, args);

		Estado oi = new Estado();

		System.out.println(oi.dataImprimir());

	}

}
