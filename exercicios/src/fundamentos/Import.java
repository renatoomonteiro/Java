package fundamentos;

import java.util.Date;

//import javax.swing.JButton;
//Importa��o de biblioteca respons�vel por data/hora,
//similar � linguagem C

public class Import {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.lang.String b = "Boa tarde!";
//Todas as bibliotegas lang est�o dispon�veis automaticamente
		java.lang.System.out.println(b);
//A exemplo do System.out.println

		String s = "Bom dia!";
		System.out.println(s);

		Date d = new Date();
		System.out.println(d);

		// JButton botao = new JButton();
//A pr�pria IDE, auxilia na digita��o (CTRL + Espa�o)
//e importa��o (CTRL+SHIFT+O)
		// JButton botao = new JButton();

	}

}
