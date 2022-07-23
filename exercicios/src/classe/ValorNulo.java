package classe;

public class ValorNulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "";
		System.out.println(s1.concat("!!!"));

		DesafioDataResposta d1 = Math.random() > 0.5 ? new DesafioDataResposta() : null;

		if (d1 != null) {
			d1.mes = 3;
			System.out.println(d1.obterDataFormatada());
		}

		// Essa variável não foi inicializada, dará o erro:
		/*
		 * 
		 * String s2; System.out.println(s2.concat("???"));
		 * 
		 * 
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem:
		 * The local variable s2 may not have been initialized
		 * 
		 * at classe.ValorNulo.main(ValorNulo.java:12)
		 * 
		 * O correto será inicializar a variável como null.
		 */
		String s2 = Math.random() > 0.5 ? "Opa!" : null;

		if (s2 != null) {
			System.out.println(s2.concat("???"));
		}
	}
}
