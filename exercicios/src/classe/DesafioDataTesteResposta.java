package classe;
//No vídeo, DataTeste é igual a DesafioDataTesteResposta 
public class DesafioDataTesteResposta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DesafioDataResposta d1 = new DesafioDataResposta();
		d1.ano = 2021;
		var d2 = new DesafioDataResposta(31,12,2020);

//		d2.dia = 31;
//		d2.mes = 12;
//		d2.ano = 2020;

		String dataFormatada1 = d1.obterDataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.printf(d2.obterDataFormatada());

		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
		
	}

}
