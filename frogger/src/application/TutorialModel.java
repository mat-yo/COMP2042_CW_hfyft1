package application;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TutorialModel {
	/**
	 * Create new scene for tutorial page
	 */
	public Scene getTut(Pane learn) {
		Scene tut = new Scene(learn);
		tut.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		return tut;
	}
	
	/**
	 * Create stage for tutorial page
	 */
	public Stage getTutStage(ActionEvent event) {
		Stage tutorialpage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		return tutorialpage;
	}
	
	/**
	 * Create new scene for main menu
	 */
	public Scene getBackMainScene(Pane main) {
		Scene menu = new Scene(main);
		menu.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		return menu;
	}
	
	/**
	 * Create stage for main menu
	 */
	public Stage getBackMainStage(ActionEvent event) {
		Stage mainpage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		return mainpage;
	}
}
