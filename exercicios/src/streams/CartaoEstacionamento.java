package streams;

public class CartaoEstacionamento {
	final String nome, posto, placa;
	final int re;
	final boolean possuiCartao;

	public CartaoEstacionamento(String nome, String posto, String placa, int re, boolean possuiCartao) {
		this.nome = nome;
		this.posto = posto;
		this.placa = placa;
		this.re = re;
		this.possuiCartao = possuiCartao;

	}
}
