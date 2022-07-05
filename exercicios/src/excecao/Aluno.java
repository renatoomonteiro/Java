//Aula 219 - Exceção Personalizada #01
package excecao;

import java.util.Objects;

public class Aluno {
	public final String nome;
	public final Double nota;
	public final boolean bomComportamento;

	public Aluno(String nome, Double nota) {
		this(nome, nota, true); // Chamada do método construtor abaixo, sem precisar inserir mais um parâmetro
	}

	public Aluno(String nome, Double nota, boolean bomComportamento) {
		this.nome = nome;
		this.nota = nota;
		this.bomComportamento = bomComportamento;
	}

	public String toString() {
		return nome + " com nota " + nota;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bomComportamento, nome, nota);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return bomComportamento == other.bomComportamento && Objects.equals(nome, other.nome)
				&& Objects.equals(nota, other.nota);
	}
	
	
	
}
