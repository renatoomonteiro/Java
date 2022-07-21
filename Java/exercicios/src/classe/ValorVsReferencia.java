package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 2;
		double b = a; // Atribui��o por valor

		a++;
		b--;

		System.out.println("Valor de a = " + a + "\nValor de b = " + b);

		DesafioDataResposta d1 = new DesafioDataResposta(1, 6, 2022);
		DesafioDataResposta d2 = d1; // Atribui��o por refer�ncia (objeto)

		d1.dia = 31;
		d2.mes = 12;
		d1.ano = 2025;

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

//M�todo est�tico da classe ValorVsReferencia, que recebe como 
//par�metro a classe DesafioDataResposta
		voltarDataParaValorPadrao(d1);

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

		int c = 10;
		alterarPrimitivo(c);
		System.out.println(c);

	}

	// Tipo de dado //Nome da vari�vel do m�todo
	static void voltarDataParaValorPadrao(DesafioDataResposta d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}

	static void alterarPrimitivo(int c) {
		c++;
	}
}
