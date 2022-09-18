// Aula 361 - Criando Projetos
//Aula 363 - Requires/Exports

module app.calculo {

	requires app.logging;

	// exports = exportar o que irei utilizar
	exports br.com.cod3r.app.calculo;

	// exports to = exportar para pasta específica:
	exports br.com.cod3r.app.calculo.interno to app.financeiro;
}