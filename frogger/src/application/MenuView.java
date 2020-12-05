package application;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MenuView {
	/**
	 * Set main menu scene
	 */
	public void setMenuScene(Stage primaryStage, Scene mainmenu, Image icon) {
		primaryStage.getIcons().add(icon);
		primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.setTitle("Frogger");
		primaryStage.setScene(mainmenu);
		primaryStage.show();
	}
}
