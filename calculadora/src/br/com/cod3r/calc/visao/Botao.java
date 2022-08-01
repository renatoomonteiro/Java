//Aula 267 - Criando os Componentes Display e Teclado
//Aula 269 - Componente Botao

package br.com.cod3r.calc.visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Botao extends JButton {
	public Botao(String texto, Color cor) {
		setText(texto);
		setFont(new Font("Calibri", Font.PLAIN, 30));
		setOpaque(true);
		setBackground(cor);
		setForeground(Color.WHITE);
		setBorder(BorderFactory.createLineBorder(Color.BLACK));

	}
}
