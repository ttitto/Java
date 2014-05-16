package keyeventstest;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.input.KeyEvent;

public class KeyEventTestUI extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane grid=new GridPane();
		Scene scene=new Scene(grid, 500, 600);
		
		scene.addEventHandler(KeyEvent.KEY_PRESSED, KeyEventsTest.keyEventHandler);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);

	}
	

}
