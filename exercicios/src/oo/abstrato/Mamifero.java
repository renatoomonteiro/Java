//Aula 168 Classe Abstrata #02

package oo.abstrato;

public abstract class Mamifero extends Animal {

	public abstract String mamar();
	
	public String mover() { //M�todo final n�o pode ser sobrescrito
		return "Se move saindo do lugar";
	}
}
