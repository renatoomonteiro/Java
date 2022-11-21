// Aula 422 - Desafio Web Service Calculadora - Resposta

package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

	// Calculadora/somar/10/20
	
	public CalculadoraController() {
		// TODO Auto-generated constructor stub
	}@GetMapping("/somar/{a}/{b}")
	public int somar (@PathVariable int a, @PathVariable	int b) {
		return a + b;
	}
	
	//Este método requer que os parâmetros sejam passados na URL
	// Calculadora/subtrair?a=100&b=39
	@GetMapping("/subtrair")
	public int subtrair (
			@RequestParam(name = "a") int a, 
			@RequestParam(name = "b") int b) {
		return a - b;
	}
	
}
