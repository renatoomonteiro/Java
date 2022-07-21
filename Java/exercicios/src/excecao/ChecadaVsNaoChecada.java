//Aula 217 - Exceção Checada vs Exceção Não Checada #01

package excecao;

public class ChecadaVsNaoChecada {
	public static void main(String[] args) {

		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Fim!");
	}

	// throw = lancar um erro
	// Exceção NÃO checada ou NÃO verificada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
	}

	// Exceção checada ou verificada
	// Obrigado colocar "throws Exception" na assinatura do método
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro bem legal #02");
	}
}
