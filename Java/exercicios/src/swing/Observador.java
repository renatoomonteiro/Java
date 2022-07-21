//Aula 256 - Padr�o Observer no Swing

package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {
//Cria��o de janelas com a linguagem Java
	public static void main(String[] args) {
		// Nome que aparecer� na janela: Observador
		JFrame janela = new JFrame("Observador");
		// Encerrar a aplica��o quando clicar no bot�o fechar:
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// Tamanho da janela:
		janela.setSize(600, 200);
		// Layout simples do Java:
		janela.setLayout(new FlowLayout());
		// Centralizar a janela:
		janela.setLocationRelativeTo(null);
		// Cria��o de um bot�o com a transcri��o "Clicar!":
		JButton botao = new JButton("Clicar!");
		// Adicionar o bot�o na janela
		janela.add(botao);

		// M�todo que ir� executar um evento ap�s o click:
		botao.addActionListener(e -> {
			// Transferir a responsabilidade de "ouvir" o click, para uma fu��o Lambda:
			System.out.println("O evento ocorreu!");
		});
		
		
		
		// Visibilidade da janela quando for executada na IDE
		janela.setVisible(true);
	}
}
