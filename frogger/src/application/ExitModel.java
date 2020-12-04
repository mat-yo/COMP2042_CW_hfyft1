package application;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ExitModel {
	/**
	 * Create new pop up scene for exit and return it
	 */
	public Scene getExitScene(Pane confirm) {
		Scene sure = new Scene(confirm);
		sure.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		return sure;
	}
	
	/**
	 * Create stage for pop up exit scene
	 */
	public Stage getExitStage() {
		Stage confirmpage = new Stage();
		return confirmpage;
	}
}
