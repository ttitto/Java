package FormTest;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FormTest extends Application {

	
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		GridPane grid=new GridPane();
		grid.setGridLinesVisible(true);
		grid.setAlignment(Pos.BASELINE_CENTER);
		grid.setStyle("-fx-background-color: #336699; -fx-border: 20px solid;");
		grid.setPadding(new Insets(50));
		grid.setHgap(10);
		grid.setVgap(5);
		grid.addRow(0, new Label("a"),new Label("c"));
		grid.addColumn(0, new Label("b"));
		grid.addColumn(1, new Label("1"));
		
		
		
		Text sceneTitle=new Text("Welcome");
		sceneTitle.setStyle("-fx-fill: #FFFFFF");
		sceneTitle.setText("New Welcome");
		grid.add(sceneTitle, 0,0);
		
		
		Scene scene=new Scene(grid,300, 300);
			
		primaryStage.setScene(scene);
		primaryStage.setTitle("JavaFX Form Test");
		
		
		
		primaryStage.show();
		
	}

}
