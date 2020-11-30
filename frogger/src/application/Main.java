package application;

import java.io.File;

import java.util.List;

import actor.Animal;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import world.MyStage;

import javafx.scene.layout.*;
import javafx.fxml.*;
import javafx.scene.image.*;

public class Main extends Application {
	Stage window;
	Scene menu, game, tutorial;
	
	AnimationTimer timer;
	MyStage background;
	Animal animal;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane main = FXMLLoader.load(getClass().getResource("main.fxml"));
		
		
		Scene mainmenu = new Scene(main, 600, 800);
		mainmenu.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		//display
		Image icon = new Image("file:resources/title/frogicon.png");
		primaryStage.getIcons().add(icon);
		primaryStage.setTitle("Frogger");
		primaryStage.setScene(mainmenu);
		primaryStage.show();
	}
}
