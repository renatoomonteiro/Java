package oo.composicao.heranca;

//A classe Heroi herda as característica, atributos e comportamentos
//da superclasse Jogador
public class Heroi extends Jogador {
//É possível sobrescrever o comportamento da superclasse

//O método booleano ataqueDoHeroi, recebe um parâmetro, que é uma variável
//oponente, que é do tipo classe Jogador
	public boolean ataqueDoHeroi(Jogador oponente) {
//Chamar o método booleano da super classe, a genérica Jogador
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		return ataque1 || ataque2 || ataque3; // "||" = ou
	}
}
