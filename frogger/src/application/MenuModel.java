package application;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;

public class MenuModel {
	/**
	 * Create new scene to display main menu
	 */
	public Scene getMenuScene(Pane main) {
		Scene mainmenu = new Scene(main, 600, 800);
		mainmenu.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		return mainmenu;
	}
	
	/**
	 * Get main menu background
	 */
	public Image getMenuBack() {
		Image icon = new Image("file:resources/title/frogicon.png");
		return icon;
	}
}
