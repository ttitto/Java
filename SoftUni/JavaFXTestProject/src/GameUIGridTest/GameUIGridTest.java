package GameUIGridTest;
//https://community.oracle.com/thread/2386973?tstart=0
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GameUIGridTest extends Application{

	public static void main(String[] args)  {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		GridPane grid=new GridPane();
		grid.setGridLinesVisible(true);
		fillGrid(grid, 4);
		
		Scene scene=new Scene(grid, 500, 600);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private static void fillGrid(GridPane pane, int squareSize){
		
		for (int i = 0; i < squareSize; i++) {
			pane.addRow(i, new Label("r"+i));
			pane.addColumn(i, new Label("c"+i));
		}
	}

}
