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
		
		/*window = primaryStage;
		
		//main menu  page
		Label gametitle = new Label("Frogger");
		
		Button start = new Button("Start Game");
		start.setOnAction(e -> window.setScene(game));
		Button learn = new Button("How To Play");
		learn.setOnAction(e -> window.setScene(tutorial));
		Button quit = new Button("Quit Game");
		quit.setOnAction(e -> window.close());
		
		BackgroundImage menuback = new BackgroundImage("file:resources/background/gamebackground.png");
		
		VBox menubox = new VBox(30);
		menubox.getChildren().addAll(gametitle,start,learn,quit);
		
		Group mainmenu = new Group();
		mainmenu.getChildren().addAll(menuback,menubox);
		
		menu = new Scene(mainmenu, 600, 800);
		
		
		//game page
		BackgroundImage gameback = new BackgroundImage("file:resources/background/gamebackground.png");
		Button backgame = new Button("Quit Game");
		backgame.setOnAction(e -> window.setScene(menu));
		
		VBox gamebutton = new VBox(30);
		gamebutton.getChildren().addAll(backgame);
		
		Group gamepage = new Group();
		gamepage.getChildren().addAll(gameback,gamebutton);
		game = new Scene(gamepage, 600, 800);
		
		//tutorial page
		Button backtut = new Button("Return to Main Menu");
		backtut.setOnAction(e -> window.setScene(menu));
		
		VBox tutorialpage = new VBox(30);
		tutorialpage.getChildren().addAll(backtut);
		tutorial = new Scene(tutorialpage, 600, 800);
		
		
		//game window
		window.setTitle("Frogger");
		window.setScene(menu);
		window.show();*/
		
		
		//background.start();
		
		//start();
	}
	/*public void createTimer() {
        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
            	if (animal.changeScore()) {
            		setNumber(animal.getPoints());
            	}
            	if (animal.getStop()) {
            		System.out.print("STOPP:");
            		background.stopMusic();
            		stop();
            		background.stop();
            		Alert alert = new Alert(AlertType.INFORMATION);
            		alert.setTitle("You Have Won The Game!");
            		alert.setHeaderText("Your High Score: "+animal.getPoints()+"!");
            		alert.setContentText("Highest Possible Score: 800");
            		alert.show();
            	}
            }
        };
    }
	public void start() {
		background.playMusic();
    	createTimer();
        timer.start();
    }

    public void stop() {
        timer.stop();
    }
    
    public void setNumber(int n) {
    	int shift = 0;
    	while (n > 0) {
    		  int d = n / 10;
    		  int k = n - d * 10;
    		  n = d;
    		  background.add(new Digit(k, 30, 360 - shift, 25));
    		  shift+=30;
    		}
    }*/
}
