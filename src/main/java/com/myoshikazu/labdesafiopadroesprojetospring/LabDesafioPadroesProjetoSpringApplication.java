package com.myoshikazu.labdesafiopadroesprojetospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 *
 * @author myoshikazu
 */

@EnableFeignClients
@SpringBootApplication
public class LabDesafioPadroesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabDesafioPadroesProjetoSpringApplication.class, args);
	}

}
