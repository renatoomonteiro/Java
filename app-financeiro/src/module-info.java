// Aula 361 - Criando Projetos

module app.financeiro {
	//requires  = informar de qual projeto depende
	requires java.base; // Importado por padrão
	//requires app.calculo; // Informação explícita de qual projeto irá precisar
	// neste caso, do projeto cálculo.
	// Esta dependência não pode ser bidirecional, pois gera problemas nas implementações
	//Importei este:
	requires app.api;
	//Irei utilizar este serviço:
	uses br.com.cod3r.app.Calculadora;
}