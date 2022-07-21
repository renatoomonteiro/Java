package fundamentos;

import java.util.Date;

//import javax.swing.JButton;
//Importação de biblioteca responsável por data/hora,
//similar à linguagem C

public class Import {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.lang.String b = "Boa tarde!";
//Todas as bibliotegas lang estão disponíveis automaticamente
		java.lang.System.out.println(b);
//A exemplo do System.out.println

		String s = "Bom dia!";
		System.out.println(s);

		Date d = new Date();
		System.out.println(d);

		// JButton botao = new JButton();
//A própria IDE, auxilia na digitação (CTRL + Espaço)
//e importação (CTRL+SHIFT+O)
		// JButton botao = new JButton();

	}

}
