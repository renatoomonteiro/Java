// Aula 382 - FlowPane

package layout;

import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;

//Este layout adequa os elementos na tela
//conforme ela é redimensionada
public class TesteFlowPane extends FlowPane {

	public TesteFlowPane() {
		Quadrado q1 = new Quadrado();
		Quadrado q2 = new Quadrado();
		Quadrado q3 = new Quadrado();
		Quadrado q4 = new Quadrado();
		Quadrado q5 = new Quadrado();
		// setHgap e setVgap: adequam os elementos
		// na horizontal e na vertical
		setHgap(10);
		setVgap(10);
		// Espaço entre os elementos na vertical
		setOrientation(Orientation.VERTICAL);
		// Alinhamento centralizado à direita
		setAlignment(Pos.CENTER_RIGHT);

		getChildren().addAll(q1, q2, q3, q4, q5);

	}
}
