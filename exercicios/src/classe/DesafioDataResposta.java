package classe;

//No v�deo a classe Data � igual a classe DesafioDataResposta 
public class DesafioDataResposta {
	int dia, mes, ano;

	//As constantes dever�o ser inicializadas, pois n�o assumem valor
	//padr�o. Ex.: final int x = 0; 
	
	DesafioDataResposta() {
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970);
		
		/*
		Valores padr�o para os dados do tipo primitivo, quando 
		n�o s�o definidos. As vari�veis assumir�o esses valores
		quando forem definidos no in�cio das classes, fora dos 
		m�todos:
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

	// M�todo construtor com par�metros
	DesafioDataResposta(int dia, int mes, int ano) {
//this � utilizado para distinguir vari�veis que contenham o 
//mesmo nome do par�metro
//this referencia o obJeto atual. N�o � acess�vel em m�todos est�ticos
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	// M�todo construtor sem par�metros
}
