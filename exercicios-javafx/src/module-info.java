//Aula 372 - Configuração do Projeto
//Aula 379 - Gerenciadores de Layout
//Aula 387 - FXML Config

module exerciciosfx {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	
	opens basico;
	opens layout;
	opens fxml;	
}