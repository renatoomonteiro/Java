//Aula 260 - Interface Gráfica do Campo Minado #01
//Aula 261 - Interface Gráfica do Campo Minado #02

package br.com.cod3r.cm.visao;

import javax.swing.JFrame;

import br.com.cod3r.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {
	// Propriedades da janela principal
	public TelaPrincipal() { // Linhas, Colunas e Minas
		Tabuleiro tabuleiro = new Tabuleiro(16, 30, 50);
		add(new PainelTabuleiro(tabuleiro));

		setTitle("Campo Minado");
		setSize(690, 438);
		setLocationRelativeTo(null);
		// setDefaultCloseOperation(DISPOSE_ON_CLOSE) = Encerra o processo através do
		// botão fechar da janela;
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TelaPrincipal();
	}
}
