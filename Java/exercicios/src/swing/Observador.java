//Aula 256 - Padrão Observer no Swing

package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {
//Criação de janelas com a linguagem Java
	public static void main(String[] args) {
		// Nome que aparecerá na janela: Observador
		JFrame janela = new JFrame("Observador");
		// Encerrar a aplicação quando clicar no botão fechar:
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// Tamanho da janela:
		janela.setSize(600, 200);
		// Layout simples do Java:
		janela.setLayout(new FlowLayout());
		// Centralizar a janela:
		janela.setLocationRelativeTo(null);
		// Criação de um botão com a transcrição "Clicar!":
		JButton botao = new JButton("Clicar!");
		// Adicionar o botão na janela
		janela.add(botao);

		// Método que irá executar um evento após o click:
		botao.addActionListener(e -> {
			// Transferir a responsabilidade de "ouvir" o click, para uma fução Lambda:
			System.out.println("O evento ocorreu!");
		});
		
		
		
		// Visibilidade da janela quando for executada na IDE
		janela.setVisible(true);
	}
}
