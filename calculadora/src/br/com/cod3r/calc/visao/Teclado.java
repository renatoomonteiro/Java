//Aula 267 - Criando os Componentes Display e Teclado
//Aula 277 - Lógica da Calculadora #06
package br.com.cod3r.calc.visao;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.com.cod3r.calc.modelo.Memoria;

@SuppressWarnings("serial")
public class Teclado extends JPanel implements ActionListener {

	private final Color COR_CINZA_ESCURO = new Color(0, 0, 156);
	private final Color COR_CINZA_CLARO = new Color(0, 255, 156);
	private final Color COR_LARANJA = new Color(255, 0, 0);

	public Teclado() {
		// O Layout dos botões será do tipo tabela;
		// com linas e colunas
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();

		setLayout(layout);
		// Adequando a largura e altura dos botões:
		c.weightx = 1;
		c.weighty = 1;
		// Adequando o tamanho dos botões à calculadora
		c.fill = GridBagConstraints.BOTH;

		// Adicionando os botões:
		// Primeira linha de botões:
		c.gridwidth = 2;
		adicionarBotao("AC", COR_CINZA_ESCURO, c, 0, 0);
		c.gridwidth = 1;
		adicionarBotao("±", COR_CINZA_ESCURO, c, 2, 0);		
		adicionarBotao("/", COR_LARANJA, c, 3, 0);
		// Segunda linha de botões:
		adicionarBotao("7", COR_CINZA_CLARO, c, 0, 1);
		adicionarBotao("8", COR_CINZA_CLARO, c, 1, 1);
		adicionarBotao("9", COR_CINZA_CLARO, c, 2, 1);
		adicionarBotao("*", COR_LARANJA, c, 3, 1);
		// Terceira linha de botões:
		adicionarBotao("4", COR_CINZA_CLARO, c, 0, 2);
		adicionarBotao("5", COR_CINZA_CLARO, c, 1, 2);
		adicionarBotao("6", COR_CINZA_CLARO, c, 2, 2);
		adicionarBotao("-", COR_LARANJA, c, 3, 2);
		// Quarta linha de botões:
		adicionarBotao("1", COR_CINZA_CLARO, c, 0, 3);
		adicionarBotao("2", COR_CINZA_CLARO, c, 1, 3);
		adicionarBotao("3", COR_CINZA_CLARO, c, 2, 3);
		adicionarBotao("+", COR_LARANJA, c, 3, 3);
		// Quinta linha de botões:
		// c.gridwidth = 2: fará com que a largura do botão 0,
		// ocupe dois espaços no grid de botões
		c.gridwidth = 2;
		adicionarBotao("0", COR_CINZA_CLARO, c, 0, 4);
		// Fazendo com que os demais botões voltem a ocupar
		// apenas um espaço
		c.gridwidth = 1;
		adicionarBotao(",", COR_CINZA_CLARO, c, 2, 4);
		adicionarBotao("=", COR_LARANJA, c, 3, 4);

	}

	// Método responsável por posicionar os botões no lugar certo
	private void adicionarBotao(String texto, Color cor, GridBagConstraints c, int x, int y) {
		c.gridx = x;
		c.gridy = y;
		Botao botao = new Botao(texto, cor);
		botao.addActionListener(this);
		add(botao, c);
	}

	// Método responsável por pegar cada valor
	// do label de cada botão
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			JButton botao = (JButton) e.getSource();
			Memoria.getInstancia().processarComando(botao.getText());
		}
	}
}
