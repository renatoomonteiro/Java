//Aula 412 - Primeiro Web Service

package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	//A notação path permite incrementar a url para
	// a chamada do método. Também aceita um 
	//array de url

	@GetMapping(path = {"/ola", "/saudacao"})
	public String ola() {
		return "Olá Spring Boot!";
	}
	
}
