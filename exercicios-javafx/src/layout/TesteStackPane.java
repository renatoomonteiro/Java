//Aula 384 - StackPane #01
//Aula 385. StackPane #02
package layout;

import javafx.application.Platform;
import javafx.scene.layout.StackPane;

public class TesteStackPane extends StackPane {

	public TesteStackPane() {
		Caixa c1 = new Caixa().comTexto("1");
		Caixa c2 = new Caixa().comTexto("2");
		Caixa c3 = new Caixa().comTexto("3");
		Caixa c4 = new Caixa().comTexto("4");
		Caixa c5 = new Caixa().comTexto("5");
		Caixa c6 = new Caixa().comTexto("6");

		getChildren().addAll(c1, c2, c3, c4, c5, c6);

		// Detectar se o usuário clicou no lado
		// esquerdo ou direito, por meio do ponto x e y da cena
		// Se o x da cena for maior que a metade da tela
		// ele clicou do lado direito e assim por diante
		setOnMouseClicked(e -> {
			if (e.getSceneX() > getScene().getWidth() / 2) {
				//Mardar o elemento do índice 0 para frente
				getChildren().get(0).toFront();
				System.out.println("Direita");
			} else {
				//Mndar o elemento do último índice para trás
				getChildren().get(5).toBack();
				System.out.println("Esquerda");
			}
		});
		//Esta Thread irá executar a passagem das cores
		// a cada 3s = sleep(3000)  
		Thread t = new Thread(() -> {
			while(true) {
				try {
					Thread.sleep(1000);
					
					Platform.runLater(() -> {
						getChildren().get(0).toFront();
					});
				} catch (Exception e) {
				}
			}
		});
		//t.setDaemon = se a aplicação for fechada,
		//para a execução do programa mesmo em segundo planho
		t.setDaemon(true);
		t.start();
	}

}
