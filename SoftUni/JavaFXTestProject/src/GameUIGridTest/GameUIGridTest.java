package GameUIGridTest;
//https://community.oracle.com/thread/2386973?tstart=0
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GameUIGridTest extends Application{

	public static void main(String[] args)  {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		GridPane grid=new GridPane();
		grid.setGridLinesVisible(true);
		//grid.setStyle("-fx-background-color: red");
		fillGrid(grid, 4);
		styleGrid(grid);
		
		for(Node n:grid.getChildren()){
			System.out.println(n);
		System.out.println(	grid.getMaxWidth());
		}
		Scene scene=new Scene(grid, 500, 600);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private static void styleGrid(GridPane pane) {
		pane.setMinSize(30,	30);
		for(Node node:pane.getChildren()){
			if(node instanceof Control){
				Control control=(Control) node;
				control.setMinSize(20,40);
		        control.setStyle("-fx-background-color: cornsilk; -fx-alignment: center;");
			}
			if(node instanceof Pane){
				Pane p=(Pane) node;
				p.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
				p.setStyle("-fx-background-color: blue; -fx-alignment: center;");
			}
		}
		
	}

	private static void fillGrid(GridPane pane, int squareSize){
		Label lbl=new Label("test");
		for (int i = 0; i < squareSize; i++) {
			pane.addRow(i, new Label("r"+i));
			pane.addColumn(i, new Label("c"+i));
			if (3==i) {
				pane.add(lbl, 0, 2);
			}
		}
		
	}

}
