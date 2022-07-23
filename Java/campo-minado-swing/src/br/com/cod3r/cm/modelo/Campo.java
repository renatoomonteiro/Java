//Aula 229 - Classe Campo: Atributos
//Aula 232 - Classe Campo: Abrir #01
//Aula 258 - Campo Minado com Observer #02

package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;

public class Campo {

	private final int linha;
	private final int coluna;

	private boolean minado = false;
	private boolean aberto = false;
	private boolean marcado = false;

	// private
	private List<Campo> vizinhos = new ArrayList<>();
	private List<CampoObservador> observadores = new ArrayList<>();

	// public Campo(int linha, int coluna)

	Campo(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}

	public void registrarObservador(CampoObservador observador) {
		observadores.add(observador);
	}

	// Este método será chamado sempre que o observador for notificado que um evento
	// aconteceu
	private void notificarObservadores(CampoEvento evento) {
		observadores.stream().forEach(o -> o.eventoOcorreu(this, evento));
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
			vizinhos.add(vizinho);
			return true;
		} else {
			return false;
		}
	}

	void alternarMarcacao() {
		if (!aberto) {
			marcado = !marcado;

			if (marcado) {
				notificarObservadores(CampoEvento.MARCAR);
			} else {
				notificarObservadores(CampoEvento.DESMARCAR);
			}
		}
	}

	boolean abrir() {
		if (!aberto && !marcado) {
			if (minado) {
				notificarObservadores(CampoEvento.EXPLODIR);
				return true;
			}

			setAberto(true);
			
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

	void minar() {
		minado = true;
	}

	public boolean isMinado() {
		return minado;
	}

	public boolean isMarcado() {
		return marcado;
	}

	void setAberto(boolean aberto) {
		this.aberto = aberto;
		
		if(aberto) {
			notificarObservadores(CampoEvento.ABRIR);
		}
	}

	public boolean isAberto() {
		return aberto;
	}

	public boolean isFechado() {
		return !isAberto();
	}

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}

	boolean objetivoAlcancado() {
		boolean desvendado = !minado && aberto;
		boolean protegido = minado && marcado;
		return desvendado || protegido;
	}

	long minasNaVizinhança() {
		// Filtragem da quantidade de minas que há na vizinhança.
		return vizinhos.stream().filter(v -> v.minado).count();
	}

	void reiniciar() {
		// Retorna ao estado inicial dos quadrados do jogo
		aberto = false;
		minado = false;
		marcado = false;
	}

}
