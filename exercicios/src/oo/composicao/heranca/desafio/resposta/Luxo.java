//Aula 166 - Interface #01
package oo.composicao.heranca.desafio.resposta;

public interface Luxo {
	public void ligarAr();

	abstract void desligarAr();

	default int velocidadeDoAr() {// M�todo padr�o, n�o requer implementa��o na classe que o chama
		return 1;
	}
}
