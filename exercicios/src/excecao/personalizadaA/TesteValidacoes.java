//Aula 219 - Exce��o Personalizada #01

package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {

	public static void main(String[] args) {

		try {
			Aluno aluno = new Aluno("Ana", 7.0);
			Validar.aluno(aluno);
			
			Validar.aluno(null);
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervaloException | 
				 IllegalArgumentException e) {
			System.out.println(e.getMessage());			
		}
		System.out.println("Fim!");
	}
}
