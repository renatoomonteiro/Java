//Aula 219 - Exce��o Personalizada #01
package excecao.personalizadaB;

import excecao.Aluno;

public class Validar {

	private Validar() {

	}

	public static void aluno(Aluno aluno) throws StringVaziaException, NumeroForaIntervaloException{

		if (aluno == null) {
			throw new IllegalArgumentException("O campo 'nome do aluno' est� nulo!");
		}

		if (aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaException("nome");
		}

		if (aluno.nota < 0 || aluno.nota > 10) {
			throw new NumeroForaIntervaloException("nota");
		}

	}

}
