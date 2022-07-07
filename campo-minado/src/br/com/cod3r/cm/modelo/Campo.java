//Aula 229 - Classe Campo: Atributos
//Aula 232 - Classe Campo: Abrir #01
package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.cod3r.cm.excecao.ExplosaoException;

public class Campo {

	private final int linha;
	private final int coluna;

	private boolean minado = false;
	private boolean aberto = false;
	private boolean marcado = false;

	// private
	private List<Campo> vizinhos = new ArrayList<>();

	// public Campo(int linha, int coluna)

	Campo(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}

	// public boolean adicionarVizinho(Campo vizinho)
	boolean adicionarVizinho(Campo vizinho) {
		// Variáveis de linhas, colunas e diagonais
		boolean linhaDiferente = linha != vizinho.linha;
		boolean colunaDiferente = coluna != vizinho.coluna;
		boolean diagonal = linhaDiferente && colunaDiferente;
		// Distâncias:
		int deltaLinha = Math.abs(linha - vizinho.linha);
		int deltaColuna = Math.abs(coluna - vizinho.coluna);
		int deltaGeral = deltaColuna + deltaLinha;
		// Se deltaGeral = 1, significa que está nas posições norte, sul, leste e oeste.
		// o que formará uma cruz, logo, não estará na diagonal.
		if (deltaGeral == 1 && !diagonal) {
			vizinhos.add(vizinho);
			return true;
		} else if (deltaGeral == 2 && diagonal) {
			return true;
		} else {
			return false;
		}
	}

	void alternarMarcacao() {
		if (!aberto) {
			marcado = !marcado;
		}
	}

	boolean abrir() {
		if (!aberto && !marcado) {
			aberto = true;

			if (minado) {
				throw new ExplosaoException();
			}

			if (vizinhancaSegura()) {
				// Exemplo de recursividade.
				vizinhos.forEach(v -> v.abrir());
			}
			return true;
		} else {
			return false;
		}
	}

	boolean vizinhancaSegura() {
		return vizinhos.stream().noneMatch(v -> v.minado);
	}
}
