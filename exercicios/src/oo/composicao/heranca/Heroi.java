package oo.composicao.heranca;

//A classe Heroi herda as caracter�stica, atributos e comportamentos
//da superclasse Jogador
public class Heroi extends Jogador {
//� poss�vel sobrescrever o comportamento da superclasse

//O m�todo booleano ataqueDoHeroi, recebe um par�metro, que � uma vari�vel
//oponente, que � do tipo classe Jogador
	public boolean ataqueDoHeroi(Jogador oponente) {
//Chamar o m�todo booleano da super classe, a gen�rica Jogador
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		return ataque1 || ataque2 || ataque3; // "||" = ou
	}
}
