package GameUIGridTest;

//https://community.oracle.com/thread/2386973?tstart=0
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class GameUIGridTest extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		GridPane grid = new GridPane();

		Scene scene = new Scene(grid, 500, 600);

		fillGrid(grid, 4);
		styleGrid(grid);

		for (Node n : grid.getChildren()) {
			System.out.println(n);
			System.out.println(grid.getMaxWidth());
		}

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private static void styleGrid(GridPane pane) {

		pane.setStyle("-fx-background-color: palegreen; -fx-padding: 5; -fx-hgap: 2; -fx-vgap: 2; -fx-alignment: center;");
		pane.setGridLinesVisible(true);
		pane.setSnapToPixel(true);

		ColumnConstraints oneThird = new ColumnConstraints();
		oneThird.setPercentWidth(100 / 5.0);
		oneThird.setHalignment(HPos.CENTER);
		pane.getColumnConstraints().addAll(oneThird, oneThird, oneThird,
				oneThird);
		RowConstraints oneHalf = new RowConstraints();
		oneHalf.setPercentHeight(100 / 5.0);
		oneHalf.setValignment(VPos.CENTER);
		pane.getRowConstraints().addAll(oneHalf, oneHalf, oneHalf, oneHalf);

		for (Node node : pane.getChildren()) {
			if (node instanceof Control) {
				Control control = (Control) node;
				// control.setMinSize(25, 30);
				control.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
				control.setStyle("-fx-background-color: cornsilk; -fx-alignment: center;");
			}

		}

	}

	private static void fillGrid(GridPane pane, int squareSize) {
		Label lbl = new Label("test");
		for (int i = 0; i < squareSize; i++) {
			pane.addRow(i, new Label("r" + i));
			if (3 != i) {
				pane.addColumn(i, new Label("c" + i));
			}

			if (3 == i) {
				pane.add(lbl, 0, 2);
			}
		}

	}

}
