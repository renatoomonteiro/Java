//Aula 166 - Interface #01
package oo.composicao.heranca.desafio.resposta;

public interface Luxo {
	public void ligarAr();

	abstract void desligarAr();

	default int velocidadeDoAr() {// Método padrão, não requer implementação na classe que o chama
		return 1;
	}
}
