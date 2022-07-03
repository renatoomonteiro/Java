package streams;

public class Aluno {
	final String nome;
	final Double nota;
	final boolean bomComportamento;

	public Aluno(String nome, Double nota) {
		this(nome, nota, true); // Chamada do método construtor abaixo, sem precisar inserir mais um parâmetro
	}

	public Aluno(String nome, Double nota, boolean bomComportamento) {
		this.nome = nome;
		this.nota = nota;
		this.bomComportamento = bomComportamento;
	}

}
