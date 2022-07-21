//Aula 208 - Match (All, Any e None)

package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Guia", 8.1);
		Aluno a4 = new Aluno("Gabi", 10.0);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Predicate<Aluno> reprovado = aprovado.negate();

		// Todos os alunos foram aprovados?
		// O Match irá procurar por condições verdadeiras, de acordo com a aprovação
		System.out.println(alunos.stream().allMatch(aprovado)); // Retorno booleano
		// Verifica se algum aluno foi aprovado.
		System.out.println(alunos.stream().anyMatch(aprovado)); // Retorno booleano
		// Verifica se nenhum foi aprovado
		// *System.err = saída de erro do sistema
		System.err.println(alunos.stream().noneMatch(aprovado)); // Retorno booleano
		// Verifica se não houve reprovação
		System.err.println(alunos.stream().noneMatch(reprovado)); // Retorno booleano

	}

}
