package application;

import actor.Animal;
import actor.BackgroundImage;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import world.MyStage;

public class GameModel {
	
	/*
	 * Get game background
	 */
	public BackgroundImage getGameBack(MyStage background) {
		BackgroundImage froggerback = new BackgroundImage("file:resources/background/gamebackground.png");
		return froggerback;
	}
	
	/*
	 * Create game scene
	 */
	public Scene getGameScene(MyStage background) {
		Scene scene  = new Scene(background, 600, 800);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		return scene;
	}
	
	/*
	 * Create the frog
	 */
	public Animal getAnimal() {
		Animal animal = new Animal("file:resources/frogger/froggerUp.png");
		return animal;
	}
	
	/*
	 * Create "quit game" button
	 */
	public Button getBackButton() {
		Button backmain = new Button("Quit Game");
		return backmain;
	}
	
	/*
	 * Create new scene for "quit game" button
	 */
	public Scene getBackMainScene(Pane main) {
		Scene returnmain = new Scene(main);
		returnmain.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		return returnmain;
	}
	
	/*
	 * Create stage for quit game scene
	 */
	public Stage getBackMainStage(ActionEvent event) {
		Stage menupage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		return menupage;
	}
	
	/*
	 * Create stage for game scene
	 */
	public Stage getGameStage(ActionEvent event) {
		Stage primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		return primaryStage;
	}
}
