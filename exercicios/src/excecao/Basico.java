//Aula 216 - O Básico Sobre Exceção

package excecao;

public class Basico {

	public static void main(String[] args) {
//Tratamento do erro, com identificação e uma mensagem com a 
//possível causa.
		Aluno a1 = null;

		try {
			imprimirNomeDoAluno(a1);
		} catch (Exception excecao) {
			System.out.println("Ocorreu um erro no momento " + "de imprimir o nome do aluno!\n");
		}

		try {
			System.out.println(0 / 0);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro " + e.getMessage());
		}

		System.out.println("Fim!");
	}

	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}

}
