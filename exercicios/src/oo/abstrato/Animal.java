//Aula 168 Classe Abstrata #02

package oo.abstrato;

public abstract class Animal {

	public String respirar() {
		return "Usando oxigênio";
	}

	public abstract String mover(); // Métodos abstratos só são criados em classes ou interfaces abstratas
}
