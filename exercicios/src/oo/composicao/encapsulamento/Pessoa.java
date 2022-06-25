//Aula nº 163 Getters/Setters

package oo.composicao.encapsulamento;

public class Pessoa {

	private String nome, sobreNome;
	public int idade;

	public Pessoa(String nome, String sobreNome, int idade) {
		setNome(nome);
		getSobreNome(sobreNome);
		setIdade(idade); // Chamada do método alterarIdade com a tratativa da idade > 0.
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void getSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getNomeCompleto() {
		return getNome() + " " + getSobreNome();
	}

	// Getter
	public int getIdade() {
		return idade;
	}

	// Setter
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade); // converte para positivo
		if (novaIdade >= 0 && novaIdade <= 130) {
			this.idade = novaIdade;
		}
	}

	@Override
	public String toString() {
		return "Olá! \nEu sou o " + getNome() + " e tenho " + getIdade() + " anos de idade.";
	}
}
