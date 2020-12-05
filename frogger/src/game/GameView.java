package game;

import actor.Animal;
import actor.BackgroundImage;
import actor.Digit;
import actor.End;
import actor.Log;
import actor.Obstacle;
import actor.Turtle;
import actor.WetTurtle;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import world.MyStage;


public class GameView {
	/**
	 * Set game background
	 */
	public void setGameBack(MyStage background,BackgroundImage froggerback) {
		background.add(froggerback);
	}
	
	/**
	 * Set game scene
	 */
	public void setGameScene(MyStage background) {
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
		background.add(new Obstacle("file:resources/obstacle/car1Left.png", 510, 655, -0.5, 40, 40));
	}
	
	/**
	 * Set the frog
	 */
	public void setAnimal(MyStage background, Animal animal) {
		background.add(animal);
	}
	
	/**
	 * Set "exit game" button
	 */
	public void setBackButton(MyStage background, Button backmain) {
		backmain.setLayoutX(220);
		backmain.setLayoutY(750);
		backmain.setPrefHeight(40);
		backmain.setPrefWidth(160);
		backmain.getStyleClass().add("gamebutton");
		background.getChildren().add(backmain);
	}
	
	/**
	 * Set game stage
	 */
	public void setGameStage(Stage primaryStage, Scene scene) {
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	/**
	 * Set return to menu scene
	 */
	public void setBackMenuScene(Scene returnmain, Stage menupage) {
		menupage.setScene(returnmain);
	}
}
