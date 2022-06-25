//Aula 164 - Polimorfismo
package oo.polimorfismo;

public class Pessoa {

	private double peso;

	public Pessoa(double peso) {
		setPeso(peso);
	}

	public void comer(Comida comida) { //Chamada com polimorfismo do m�todo 
		this.peso += comida.getPeso();
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso >= 0) {// S� ir� setar o peso se for >= 0
			this.peso = peso;
		}
	}
}
