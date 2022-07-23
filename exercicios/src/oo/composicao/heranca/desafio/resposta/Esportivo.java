//Aula 166 - Interface #01
package oo.composicao.heranca.desafio.resposta;

public interface Esportivo {
	// Todos os m�todos dentro de uma interface, s�o p�blicos e abstratos
	public abstract void ligarTurbo(); // M�todo abstract, n�o tem corpo, logo n�o tem o abre e fecha chaves. "{", "}".
	// Pode ou n�o deixar expl�cito, o java identifica isso

	void desligarTurbo();
	//Isso � utilizado quando h� a necessidade de implementar o m�todo e mold�lo dentro da classe que o chama.
	//Este exemplo � dado na classe Ferrari, que chama o m�todo e trata o delta dentro dele

}
