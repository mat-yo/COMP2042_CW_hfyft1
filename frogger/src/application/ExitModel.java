package application;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ExitModel {
	public Scene setExitScene(Pane confirm) {
		Scene sure = new Scene(confirm);
		sure.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		return sure;
	}
	
	public Stage setExitStage() {
		Stage confirmpage = new Stage();
		return confirmpage;
	}
}
