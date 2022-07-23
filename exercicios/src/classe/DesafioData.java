package classe;

public class DesafioData {
	String dia, mes, ano;

	String obterDataFormatada() {
		@SuppressWarnings("unused")
		String diaMesAno;
		dia = "26";
		mes = "10";
		ano = "1981";

		return diaMesAno = dia + "/" + mes + "/" + ano;
	}
}
