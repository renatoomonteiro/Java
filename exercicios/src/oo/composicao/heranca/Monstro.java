package oo.composicao.heranca;
//A classe Monstro herda as característica, atributos e comportamentos
//da superclasse Jogador
public class Monstro extends Jogador{
	public boolean atacar(Jogador oponente) {
		// medir a distância de um jogador para o outro
		int deltaX = Math.abs(x - oponente.x);// abs, indiferente se é
		int deltaY = Math.abs(y - oponente.y);// positivo ou negativo
//Estão no mesmo eixo X e não no eixo Y.
//É possível atacar
		if (deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			return true;
//Estão no mesmo eixo Y e não no eixo X.
//É possível atacar
		} else if (deltaX == 1 && deltaY == 0) {
			oponente.vida -= 10;
			return true;
		} else {
			return false;
		}

	}
}
