// Aula 361 - Criando Projetos

module app.financeiro {
	//requires  = informar de qual projeto depende
	requires java.base; // Importado por padr�o
	//requires app.calculo; // Informa��o expl�cita de qual projeto ir� precisar
	// neste caso, do projeto c�lculo.
	// Esta depend�ncia n�o pode ser bidirecional, pois gera problemas nas implementa��es
	//Importei este:
	requires app.api;
	//Irei utilizar este servi�o:
	uses br.com.cod3r.app.Calculadora;
}