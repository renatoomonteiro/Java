//Aula 267 - Criando os Componentes Display e Teclado
//Aula 268 - Componente Display
//Aula 272 - Lógica da Calculadora #01
//Aula 273 - Lógica da Calculadora #02

package br.com.cod3r.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.cod3r.calc.modelo.Memoria;
import br.com.cod3r.calc.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador{

	private final JLabel label;

	public Display() {
		Memoria.getInstancia().adicionarObservador(this);
		
		setBackground(new Color(57, 255, 20));
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 30));

		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));
		add(label);

	}
	
	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
		
	}
}
