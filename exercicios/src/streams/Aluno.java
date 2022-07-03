package streams;

public class Aluno {
	final String nome;
	final Double nota;
	final boolean bomComportamento;

	public Aluno(String nome, Double nota) {
		this(nome, nota, true); // Chamada do m�todo construtor abaixo, sem precisar inserir mais um par�metro
	}

	public Aluno(String nome, Double nota, boolean bomComportamento) {
		this.nome = nome;
		this.nota = nota;
		this.bomComportamento = bomComportamento;
	}

}
