package fundamentos.operadores;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Imc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Criar um programa que leia o peso e a altura do 
 * usuário e imprima no console o IMC.*/
		
		DecimalFormat formatador = new DecimalFormat("0.0");
		//Método responsável pelo formato 0.0
		
		String peso = JOptionPane.showInputDialog("Informe o seu peso: ");
		Double p = Double.parseDouble(peso.replace(",", "."));
		
		String altura = JOptionPane.showInputDialog("Informe a sua altura: ");
		Double a = Double.parseDouble(altura.replace(",", "."));
		
		
		System.out.println("Seu IMC é: "+ formatador.format(p/(a*a)));
					//Forma de utilizar o .format(x);

		
		
		
				 
	}

}
