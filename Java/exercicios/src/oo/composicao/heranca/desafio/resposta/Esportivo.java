//Aula 166 - Interface #01
package oo.composicao.heranca.desafio.resposta;

public interface Esportivo {
	// Todos os métodos dentro de uma interface, são públicos e abstratos
	public abstract void ligarTurbo(); // Método abstract, não tem corpo, logo não tem o abre e fecha chaves. "{", "}".
	// Pode ou não deixar explícito, o java identifica isso

	void desligarTurbo();
	//Isso é utilizado quando há a necessidade de implementar o método e moldálo dentro da classe que o chama.
	//Este exemplo é dado na classe Ferrari, que chama o método e trata o delta dentro dele

}
