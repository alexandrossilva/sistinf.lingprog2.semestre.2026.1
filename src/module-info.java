module exemplo13 {
	
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	
	opens aulas.aula13.exemplo01 to javafx.fxml;
	opens aulas.aula14.exemplo01 to javafx.fxml;
	
	exports aulas.aula13.exemplo01;
	exports aulas.aula14.exemplo01;
	
}