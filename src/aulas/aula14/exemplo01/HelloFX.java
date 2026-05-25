package aulas.aula14.exemplo01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloFX extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/aulas/aula14/exemplo01/hellofx.fxml"));
        Scene cenaInicial = new Scene(root);
        stage.setScene(cenaInicial);
        stage.show();		
	}
	
	public static void main(String[] args) {
        launch();
    }


}
