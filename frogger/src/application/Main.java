package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.fxml.*;
import javafx.scene.image.*;

public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	
	/**
	 * Display stage for scene when start the application
	 * Create high score file if the file do not exist
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		int i;
		
		//Create new text file to save score board if text file not exist
		File score = new File("src/highscore/highscores.txt");
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
		
		MenuModel mm = new MenuModel();
		MenuView mv = new MenuView();
		
		Scene mainmenu = mm.getMenuScene(main);
		Image icon = mm.getMenuBack();
		
		mv.setMenuScene(primaryStage, mainmenu, icon);
	}
}
