// Aula 361 - Criando Projetos
//Aula 363 - Requires/Exports
// Aula 366 - Módulos e Reflection

module app.calculo {

	requires transitive app.logging;

	// exports = exportar o que irei utilizar
	exports br.com.cod3r.app.calculo;

	// exports to = exportar para pasta específica:
//	exports br.com.cod3r.app.calculo.interno 
//	to app.financeiro;
	
	opens br.com.cod3r.app.calculo to app.financeiro;
	
	requires app.api;
	provides br.com.cod3r.app.Calculadora 
	with br.com.cod3r.app.calculo.CalculadoraImpl;
}