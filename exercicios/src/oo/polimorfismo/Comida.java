//Aula 164 - Polimorfismo
package oo.polimorfismo;

//Aula 168 - Classe Abstrata
public abstract class Comida { // Comida passou a ser abstrata, logo, não poderá ser instanciada
	private double peso;

	public Comida(double peso) {
		setPeso(peso);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso >= 0) {// Só irá setar o peso se for >= 0
			this.peso = peso;
		}
	}
}
