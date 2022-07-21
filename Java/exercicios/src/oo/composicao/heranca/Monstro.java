package oo.composicao.heranca;
//A classe Monstro herda as caracter�stica, atributos e comportamentos
//da superclasse Jogador
public class Monstro extends Jogador{
	public boolean atacar(Jogador oponente) {
		// medir a dist�ncia de um jogador para o outro
		int deltaX = Math.abs(x - oponente.x);// abs, indiferente se �
		int deltaY = Math.abs(y - oponente.y);// positivo ou negativo
//Est�o no mesmo eixo X e n�o no eixo Y.
//� poss�vel atacar
		if (deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			return true;
//Est�o no mesmo eixo Y e n�o no eixo X.
//� poss�vel atacar
		} else if (deltaX == 1 && deltaY == 0) {
			oponente.vida -= 10;
			return true;
		} else {
			return false;
		}

	}
}
