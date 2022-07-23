package classe;

public class DesafioDataTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DesafioData dataGab = new DesafioData();

		dataGab.dia = "30";
		dataGab.mes = "04";
		dataGab.ano = "2015";

		DesafioData dataRe = new DesafioData();

		dataRe.dia = "08";
		dataRe.mes = "04";
		dataRe.ano = "1974";

		System.out.printf("O Gabriel nasceu em %s/%s/%s\n", dataGab.dia, dataGab.mes, dataGab.ano);
		System.out.printf("A Regiane nasceu em %s/%s/%s", dataRe.dia, dataRe.mes, dataRe.ano);

		DesafioData dataRenato = new DesafioData();

		System.out.println("\nO Renato nasceu em " + dataRenato.obterDataFormatada());

	}

}
