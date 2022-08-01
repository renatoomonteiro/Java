//Aula 266 - Tela Principal da Calculadora
//Aula 267 - Criando os Componentes Display e Teclado

package br.com.cod3r.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame {

	public Calculadora() {

		organizarLayout();

		setSize(232, 322);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void organizarLayout() {
		// BorderLayout() organiza os elementos de acordo com os pontos cardeais
		setLayout(new BorderLayout());
		
		//Posicionando o display da calculadora no topo
		Display display = new Display();
		display.setPreferredSize(new Dimension(233, 60));
		add(display,BorderLayout.NORTH);
		
		//Posicionando o teclado da calculadora no centro, abaixo do display
		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER);
		
		//Posicionando os botões na calculadora
		
		

	}

	public static void main(String[] args) {
		new Calculadora();
	}

}
