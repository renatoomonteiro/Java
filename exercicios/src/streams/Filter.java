package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno a1 = new Aluno("Ana", 6.8, true);
		Aluno a2 = new Aluno("Bia", 5.8, true);
		Aluno a3 = new Aluno("Daniel", 3.8, true);
		Aluno a4 = new Aluno("Gui", 6.8, true);
		Aluno a5 = new Aluno("Regiane", 7.1, true);
		Aluno a6 = new Aluno("Renato", 8.8, true);
		Aluno a7 = new Aluno("Gabriel", 10.8, true);
		
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7);
		
//		alunos.stream()
//			.filter(a -> a.nome.equals("Ana")) // Filtro se a nota for > 7a.nota >= 7
//			.map(a -> "Parab�ns, " + a.nome + ", voc� foi aprovado(a)!")
//			.forEach(System.out::println);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, String> saudacaoAprovado = 
				a -> "Parab�ns, " + a.nome + ", voc� foi aprovado(a)!"; 
				
		alunos.stream()
			.filter(aprovado)
			.map(saudacaoAprovado)
			.forEach(System.out::println);
	}
}
