package classe;

//No vídeo a classe Data é igual a classe DesafioDataResposta 
public class DesafioDataResposta {
	int dia, mes, ano;

	//As constantes deverão ser inicializadas, pois não assumem valor
	//padrão. Ex.: final int x = 0; 
	
	DesafioDataResposta() {
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970);
		
		/*
		Valores padrão para os dados do tipo primitivo, quando 
		não são definidos. As variáveis assumirão esses valores
		quando forem definidos no início das classes, fora dos 
		métodos:
		byte, short, int, long = 0;
		float, double = 0.0;
		boolean = false;
		char = '\u0000'
		*/
	}

	String obterDataFormatada() {
		final String formato = "%d/%d/%d\n"; //Final = CONSTANTE
		return String.format(formato, this.dia, mes, ano);
	}

	void imprimirDataFormatada() {
		System.out.print(this.obterDataFormatada());
	}

	// Método construtor com parâmetros
	DesafioDataResposta(int dia, int mes, int ano) {
//this é utilizado para distinguir variáveis que contenham o 
//mesmo nome do parâmetro
//this referencia o obJeto atual. Não é acessível em métodos estáticos
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	// Método construtor sem parâmetros
}
