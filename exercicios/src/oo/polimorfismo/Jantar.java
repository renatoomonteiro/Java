//Aula 164 - Polimorfismo
package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {

		Pessoa convidado = new Pessoa(99.65);

		Arroz arroz = new Arroz(0.2);
		Feijao feijao = new Feijao(0.1);
		Sorvete sobremesa = new Sorvete(4.0);
		Salada salada = new Salada(0.4);

		System.out.println(convidado.getPeso()); // Mostra o peso inicial

		convidado.comer(arroz);
		System.out.println(convidado.getPeso()); // Mostra o peso após comer arroz

		convidado.comer(feijao);
		System.out.println(convidado.getPeso()); // Mostra o peso após comer feijão

		convidado.comer(sobremesa);
		System.out.println(convidado.getPeso()); // Mostra o peso após comer sobremesa

		convidado.comer(salada);
		System.out.println(convidado.getPeso()); // Mostra o peso após comer salada

	}

}
