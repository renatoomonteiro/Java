package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	final String nome;
	final List<Curso> cursos = new ArrayList<>();
	// Lista Constante, aponta para um único endereço de memória

	Aluno(String nome) {
		this.nome = nome;
	}

	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}

	Curso obterCursoPorNome(String nome) {
		for (Curso curso : this.cursos) { // Caso não ache nenhum curso igual àquele passado como parâmetro;
			if (curso.nome.equalsIgnoreCase(nome)) { // retornará nulo
				return curso;
			}
		}
		return null;
	}

	public String toString() {
		return nome; // Retorna o nome no formato string
	}
}
