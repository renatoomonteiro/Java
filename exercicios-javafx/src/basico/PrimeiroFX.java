//Aula 372 - Configuração do Projeto

package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PrimeiroFX extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
				
		Button botaoA = new Button("A");
		Button botaoB = new Button("B");
		Button botaoC = new Button("C");
		Button botaoSair = new Button("Sair");
		
		
		botaoA.setOnAction(e -> System.out.println("Renato Bonitão"));
		botaoB.setOnAction(e -> System.out.println("Regiane Bonitona"));
		botaoC.setOnAction(e -> System.out.println("Gabriel Bonitão"));
		botaoSair.setOnAction(e -> System.exit(0));
		
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.setSpacing(10 );
		box.getChildren().add(botaoA);
		box.getChildren().add(botaoB);
		box.getChildren().add(botaoC);
		box.getChildren().add(botaoSair);
		
		Scene unicacena = new Scene(box, 200, 350);
		
		primaryStage.setScene(unicacena);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
