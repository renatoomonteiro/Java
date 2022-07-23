package oo.composicao.heranca;

public class Jogador {
	public int x, y;
	public int vida = 100;

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

	public boolean andar(Direcao direcao) {
		switch (direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
		}
		return true;
	}
}
