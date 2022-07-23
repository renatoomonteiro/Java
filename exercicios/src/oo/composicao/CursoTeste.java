package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");

		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web 2023");
		Curso curso3 = new Curso("React Native");

		curso1.adicionaraluno(aluno1);
		curso1.adicionaraluno(aluno2);

		curso2.adicionaraluno(aluno1);
		curso2.adicionaraluno(aluno3);

		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);

		for (Aluno aluno : curso3.alunos) {
			System.out.println("Estou matriculado no curso " + curso3.nome);
			System.out.println("...e o meu nome é " + aluno.nome);
			System.out.println();
		}
		// Exibindo o nome dos alunos cadastrados no curso na posição 0 do arraylist
		System.out.println(aluno1.cursos.get(0).alunos);
		// Exibindo o nome dos alunos cadastrados no curso na posição 1 do arraylist
		System.out.println(aluno1.cursos.get(1).alunos);
		// Exibindo o nome dos alunos cadastrados no curso na posição 2 do arraylist
		System.out.println(aluno1.cursos.get(2).alunos);

		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");

		// Se curso encontrado tiver retorno diferente de nulo, retornará o nome do
		// curso e os alunos inscritos no curso
		
		if (cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}
}
