//Aula 389 - Login Controller

package fxml;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {

	@FXML
	private TextField campoEmail;

	@FXML
	private PasswordField campoSenha;

	public void entrar() {
		// Pegar os dados dos campos:
		System.out.println(campoEmail.getText());
		System.out.println(campoSenha.getText());
	}
}
