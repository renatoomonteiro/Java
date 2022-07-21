//Aula 168 Classe Abstrata #02

package oo.abstrato;

public abstract class Mamifero extends Animal {

	public abstract String mamar();
	
	public String mover() { //Método final não pode ser sobrescrito
		return "Se move saindo do lugar";
	}
}
