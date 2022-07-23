package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Guia", 8.1);
		Aluno a4 = new Aluno("Gabi", 10.0);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

		Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
			if (aluno1.nota > aluno2.nota)
				return 1;
			if (aluno1.nota < aluno2.nota)
				return -1;
			return 0;
		};
		// Exibir a melhor nota da turma
		System.out.println("O melhor classificado(a) foi o(a) " + alunos.stream().max(melhorNota).get());

		// Exibir a menor nota da turma
		System.out.println("O pior classificado(a) foi o(a) " + alunos.stream().min(melhorNota).get());

	}

}
