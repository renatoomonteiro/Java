//Aula 260 - Interface Gr�fica do Campo Minado #01
//Aula 261 - Interface Gr�fica do Campo Minado #02

package br.com.cod3r.cm.visao;

import java.awt.GridLayout;

//import javax.swing.JButton;
import javax.swing.JPanel;

import br.com.cod3r.cm.modelo.Tabuleiro;
//JPanel = � um container que agrupa v�rios tipos de componentes

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel {
//Esta classe ir� agrupar todos os bot�es que armazenar� as linhas e colunas do jogo
	public PainelTabuleiro(Tabuleiro tabuleiro) {
		// Layout com a quantidade de linhas e colunas do tabuleiro
		setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));
		
		tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));
		
		tabuleiro.registrarObservador(e -> {
			//TODO mostrar resultado para o usu�rio!
		});

//		int total = tabuleiro.getLinhas() * tabuleiro.getColunas();
//
//		for (int i = 0; i < total; i++) {
//			add(new BotaoCampo(null));
//		}
	}
}
