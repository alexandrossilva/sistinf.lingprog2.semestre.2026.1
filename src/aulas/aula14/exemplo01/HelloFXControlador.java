package aulas.aula14.exemplo01;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloFXControlador {
	
	@FXML
	private Label rotulo;
	
	@FXML
	private void tratarAcaoBotao(ActionEvent evento) {
		rotulo.setText("Alo Mundo!");
	}

}
