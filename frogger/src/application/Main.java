package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import actor.Animal;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
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
		int i;
		
		File score = new File("highscores.txt");
		
		//create new text file to save score board if text file not exist
		if(score.exists()==false) {
			score.createNewFile();
			for(i=0;i<10;i++) {
				FileWriter fw = new FileWriter(score,true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);
				pw.printf("0\n");
				pw.close();
				bw.close();
				fw.close();
			}
		} else {}
		
		Pane main = FXMLLoader.load(getClass().getResource("main.fxml"));
		Scene mainmenu = new Scene(main, 600, 800);
		mainmenu.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		//display window
		Image icon = new Image("file:resources/title/frogicon.png");
		primaryStage.getIcons().add(icon);
		primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.setTitle("Frogger");
		primaryStage.setScene(mainmenu);
		primaryStage.show();
	}
}
