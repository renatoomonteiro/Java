//Aula 364 - Requires Transitive
// Aula 366 - Módulos e Reflection

open module app.logging {
	
	exports br.com.cod3r.app.logging;
	// Exemplo abaixo de dependência cíclica, não recomendado
	//requires app.financeiro; 
}