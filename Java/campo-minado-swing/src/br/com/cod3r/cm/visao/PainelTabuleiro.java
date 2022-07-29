//Aula 260 - Interface Gráfica do Campo Minado #01
//Aula 261 - Interface Gráfica do Campo Minado #02

package br.com.cod3r.cm.visao;

import java.awt.GridLayout;

import javax.swing.JOptionPane;
//import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import br.com.cod3r.cm.modelo.Tabuleiro;
//JPanel = é um container que agrupa vários tipos de componentes

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel {
//Esta classe irá agrupar todos os botões que armazenará as linhas e colunas do jogo
	public PainelTabuleiro(Tabuleiro tabuleiro) {
		// Layout com a quantidade de linhas e colunas do tabuleiro
		setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));
		
		tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));
		
		tabuleiro.registrarObservador(e -> {
			//SwingUtilities irá garantir que a interface inteira seja atualizada e depois mostre a mensagem
			SwingUtilities.invokeLater(() -> {
				
				if(e.isGanhou()) {
					JOptionPane.showMessageDialog(this, "Ganhou! \n:)");
				} else {
					JOptionPane.showMessageDialog(this, "Perdeu! \n:(");
				}
				
				tabuleiro.reiniciar();
				
			});
			
		});

//		int total = tabuleiro.getLinhas() * tabuleiro.getColunas();
//
//		for (int i = 0; i < total; i++) {
//			add(new BotaoCampo(null));
//		}
	}
}
