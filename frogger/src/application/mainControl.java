package application;

import java.net.URL;

import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.layout.*;
import java.io.IOException;
import javafx.event.ActionEvent;

import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.Node;

import actor.Animal;
import actor.BackgroundImage;
import actor.Digit;
import actor.End;
import actor.Log;
import actor.Obstacle;
import actor.Turtle;
import actor.WetTurtle;
import world.MyStage;

import javafx.animation.AnimationTimer;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;



import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


public class mainControl {
	@FXML
	private Pane tutpage;
	
	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private MyStage background;
    
    @FXML
    private Animal animal;
    
    @FXML AnimationTimer timer;
    
    @FXML
    private void game(ActionEvent event) throws IOException {
    	//Pane game = FXMLLoader.load(getClass().getResource("game.fxml"));
    	//BackgroundImage gameback = new BackgroundImage("file:resources/background/gamebackground.png");
    	background = new MyStage();
    	
	    Scene scene  = new Scene(background, 600, 800);
	    BackgroundImage froggerback = new BackgroundImage("file:resources/background/gamebackground.png");
		background.add(froggerback);
		
		
		background.add(new Digit(0, 30, 500, 30));
		
		
		//end
		background.add(new End(13,90));
		background.add(new End(13+141-13,90));
		background.add(new End(13+(141-13)*2,90));
		background.add(new End(13+(141-13)*3,90));
		background.add(new End(13+(141-13)*4,90));
		
		//10th row
		background.add(new Log("file:resources/platform/log2.png", 5, 150, 1, 180, 50));
		background.add(new Log("file:resources/platform/log3.png", 240, 150, 1, 120, 50));
		background.add(new Log("file:resources/platform/log2.png", 415, 150, 1, 180, 50));
		
		//9th row
		background.add(new Turtle(5, 200, -0.5, 120, 50));
		background.add(new WetTurtle(155, 200, -0.5, 120, 50));
		background.add(new Turtle(325, 200, -0.5, 120, 50));
		background.add(new Turtle(475, 200, -0.5, 120, 50));
		
		//8th row
		background.add(new Log("file:resources/platform/logs.png", 5, 250, 1, 280, 50));
		background.add(new Log("file:resources/platform/logs.png", 315, 250, 1, 280, 50));
		
		//7th row
		background.add(new Log("file:resources/platform/log3.png", 25, 300, 1, 120, 50));
		background.add(new Log("file:resources/platform/log3.png", 240, 300, 1, 120, 50));
		background.add(new Log("file:resources/platform/log3.png", 455, 300, 1, 120, 50));
		
		//6th row
		background.add(new Turtle(35, 345, -0.5, 120, 50));
		background.add(new WetTurtle(240, 345, -0.5, 120, 50));
		background.add(new Turtle(445, 345, -0.5, 120, 50));
		/*
		//5th row
		background.add(new Obstacle("file:resources/obstacle/truck1Left.png", 150, 455, -0.5, 200, 40));
		background.add(new Obstacle("file:resources/obstacle/truck1Left.png", 450, 455, -0.5, 200, 40));
		
		//4th row
		background.add(new Obstacle("file:resources/obstacle/car1Right.png", 10, 505, 1.5, 40, 40));
		background.add(new Obstacle("file:resources/obstacle/car1Right.png", 300, 505, 1.5, 40, 40));
		background.add(new Obstacle("file:resources/obstacle/car1Right.png", 500, 505, 1.5, 40, 40));
		
		//3rd row
		background.add(new Obstacle("file:resources/obstacle/car1Left.png", 50, 555, -0.5, 40, 40));
		background.add(new Obstacle("file:resources/obstacle/car1Left.png", 225, 555, -0.5, 40, 40));
		background.add(new Obstacle("file:resources/obstacle/car1Left.png", 335, 555, -0.5, 40, 40));
		background.add(new Obstacle("file:resources/obstacle/car1Left.png", 510, 555, -0.5, 40, 40));
		
		
		//2nd row
		background.add(new Obstacle("file:resources/obstacle/truck1"+"Right.png", 0, 605, 0.5, 150, 40));
		background.add(new Obstacle("file:resources/obstacle/truck1"+"Right.png", 250, 605, 0.5, 150, 40));
		background.add(new Obstacle("file:resources/obstacle/truck1"+"Right.png", 500, 605, 0.5, 150, 40));
		
		//1st row
		background.add(new Obstacle("file:resources/obstacle/car1Left.png", 50, 655, -0.5, 40, 40));
		background.add(new Obstacle("file:resources/obstacle/car1Left.png", 225, 655, -0.5, 40, 40));
		background.add(new Obstacle("file:resources/obstacle/car1Left.png", 335, 655, -0.5, 40, 40));
		background.add(new Obstacle("file:resources/obstacle/car1Left.png", 510, 655, -0.5, 40, 40));*/
		
		animal = new Animal("file:resources/frogger/froggerUp.png");
		background.add(animal);
		
		
		background.start();
		Stage primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		primaryStage.setScene(scene);
		primaryStage.show();
		start();
    }
    
    
   /* 
   public void start() {
		background.playMusic();
    }
    */
    
    
    public void createTimer() {
        //AnimationTimer timer = new AnimationTimer() {
    	timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
            	//System.out.printf("%d\n", animal.getPoints());
            	if (animal.changeScore()) {
            		setNumber(animal.getPoints());
            		//setNumber(5);
            		System.out.printf("%d\n", animal.getPoints());
            	}
            	if (animal.getStop()) {
            		System.out.print("STOP\n");
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
    		  background.add(new Digit(k, 30, 500 - shift, 30));
    		  shift+=30;
    		}
    }
    
    
    
    
    
    
    
    @FXML
    private void tutorial(ActionEvent event) throws IOException {
    	Pane learn = FXMLLoader.load(getClass().getResource("tutorial.fxml"));
    	Scene tut = new Scene(learn);
    	tut.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
    	
    	Stage tutorialpage = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	tutorialpage.setScene(tut);
    	tutorialpage.show();
    }
    
    @FXML
    private void exit(ActionEvent event) throws IOException {
    	Pane confirm = FXMLLoader.load(getClass().getResource("confirm.fxml"));
    	Scene sure = new Scene(confirm);
    	sure.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
    	Stage confirmpage = new Stage();
    	confirmpage.initStyle(StageStyle.UNDECORATED);
    	confirmpage.setScene(sure);
    	confirmpage.show();
    }
}


