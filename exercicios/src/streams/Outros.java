//Aula 210 - Outros Métodos

package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10.0);
		Aluno a5 = new Aluno("Ana", 7.1);
		Aluno a6 = new Aluno("Pedro", 6.1);
		Aluno a7 = new Aluno("Gui", 8.1);
		Aluno a8 = new Aluno("Maria", 10.0);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		// Distinct funciona igual nos BD's, não exibe valores duplicados
		System.out.println("distinct...");
		alunos.stream().distinct().forEach(System.out::println);

		System.out.println("\nSkip/LImit");
		alunos.stream()
				.distinct() // Sem repetições
				.skip(2) // Pular dois elementos
				.limit(2) // Limitar a dois elementos
				.forEach(System.out::println);
		
		System.out.println("\nTakeWhile"); //Enquanto acontecer determinada condição
		alunos.stream()
		.distinct() // Sem repetições
		.skip(2) // Pular dois elementos
		.takeWhile(a -> a.nota >= 7) //Enquanto a nota for >= 7
		.forEach(System.out::println);
	}
}
