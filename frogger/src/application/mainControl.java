package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.Collections;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.layout.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.event.ActionEvent;

import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.Group;

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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

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
    
    @FXML 
    AnimationTimer timer;
    saveScore save;
    Image img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11;
    ImageView i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11;
    Label p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
    
    @FXML
    private void game(ActionEvent event) throws IOException {
    	background = new MyStage();
    	
	    Scene scene  = new Scene(background, 600, 800);
	    scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
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
		
		animal = new Animal("file:resources/frogger/froggerUp.png");
		background.add(animal);
		
		Button backmain = new Button("Quit Game");
		backmain.setLayoutX(220);
		backmain.setLayoutY(750);
		backmain.setPrefHeight(40);
		backmain.setPrefWidth(160);
		backmain.getStyleClass().add("gamebutton");
		background.getChildren().add(backmain);
		
		Pane main = FXMLLoader.load(getClass().getResource("main.fxml"));
		Scene returnmain = new Scene(main);
		returnmain.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage menupage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		backmain.setOnAction(e -> {menupage.setScene(returnmain);background.stopMusic();});
		
		background.start();
		Stage primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		primaryStage.setScene(scene);
		primaryStage.show();
		start();
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
    private void score(ActionEvent event) throws IOException {
    	Pane point = new Pane();
    	point.setPrefHeight(800);
    	point.setPrefWidth(600);
    	point.getStyleClass().add("scorebackground");
    	
    	Label title = new Label("High Score");
    	title.getStyleClass().add("scoretitle");
    	title.setLayoutX(235);
    	title.setLayoutY(95);
    	
    	Button returnmain = new Button("Back");
    	returnmain.setLayoutX(220);
    	returnmain.setLayoutY(700);
    	returnmain.setPrefHeight(40);
    	returnmain.setPrefWidth(160);
    	returnmain.getStyleClass().add("tutbutton");
    	
    	Pane main = FXMLLoader.load(getClass().getResource("main.fxml"));
		Scene gomain = new Scene(main);
		gomain.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage menupage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		returnmain.setOnAction(e -> menupage.setScene(gomain));
    	
		img1 = new Image("file:resources/number/1.png", 40, 40, true, true);
		i1 = new ImageView(img1);
		i1.setLayoutX(150);
		i1.setLayoutY(135);
		
		img2 = new Image("file:resources/number/2.png", 40, 40, true, true);
		i2 = new ImageView(img2);
		i2.setLayoutX(150);
		i2.setLayoutY(180);
		
		img3 = new Image("file:resources/number/3.png", 40, 40, true, true);
		i3 = new ImageView(img3);
		i3.setLayoutX(150);
		i3.setLayoutY(225);
		
		img4 = new Image("file:resources/number/4.png", 40, 40, true, true);
		i4 = new ImageView(img4);
		i4.setLayoutX(150);
		i4.setLayoutY(270);
		
		img5 = new Image("file:resources/number/5.png", 40, 40, true, true);
		i5 = new ImageView(img5);
		i5.setLayoutX(150);
		i5.setLayoutY(315);
		
		img6 = new Image("file:resources/number/6.png", 40, 40, true, true);
		i6 = new ImageView(img6);
		i6.setLayoutX(150);
		i6.setLayoutY(360);
		
		img7 = new Image("file:resources/number/7.png", 40, 40, true, true);
		i7 = new ImageView(img7);
		i7.setLayoutX(150);
		i7.setLayoutY(405);
		
		img8 = new Image("file:resources/number/8.png", 40, 40, true, true);
		i8 = new ImageView(img8);
		i8.setLayoutX(150);
		i8.setLayoutY(450);
		
		img9 = new Image("file:resources/number/9.png", 40, 40, true, true);
		i9 = new ImageView(img9);
		i9.setLayoutX(150);
		i9.setLayoutY(495);
		
		img10 = new Image("file:resources/number/0.png", 40, 40, true, true);
		i10 = new ImageView(img10);
		i10.setLayoutX(150);
		i10.setLayoutY(540);
		
		img11 = new Image("file:resources/number/1.png", 40, 40, true, true);
		i11 = new ImageView(img11);
		i11.setLayoutX(110);
		i11.setLayoutY(540);
		
		ArrayList<String> pts = new ArrayList<>();
		File score = new File("highscores.txt");
		try {
			Scanner readscore = new Scanner(score);
			while(readscore.hasNextLine()) {
				String data = readscore.nextLine();
				pts.add(data);
			}
			readscore.close();
		} catch(FileNotFoundException e) {}
		
		Collections.sort(pts);
		Collections.reverse(pts);
		
		p1 = new Label(pts.get(0));
		p1.setLayoutX(420);
		p1.setLayoutY(135);
		p1.getStyleClass().add("scoretext");
		
		p2 = new Label(pts.get(1));
		p2.setLayoutX(420);
		p2.setLayoutY(180);
		p2.getStyleClass().add("scoretext");
		
		p3 = new Label(pts.get(2));
		p3.setLayoutX(420);
		p3.setLayoutY(225);
		p3.getStyleClass().add("scoretext");
		
		p4 = new Label(pts.get(3));
		p4.setLayoutX(420);
		p4.setLayoutY(270);
		p4.getStyleClass().add("scoretext");
		
		p5 = new Label(pts.get(4));
		p5.setLayoutX(420);
		p5.setLayoutY(315);
		p5.getStyleClass().add("scoretext");
		
		p6 = new Label(pts.get(5));
		p6.setLayoutX(420);
		p6.setLayoutY(360);
		p6.getStyleClass().add("scoretext");
		
		p7 = new Label(pts.get(6));
		p7.setLayoutX(420);
		p7.setLayoutY(405);
		p7.getStyleClass().add("scoretext");
		
		p8 = new Label(pts.get(7));
		p8.setLayoutX(420);
		p8.setLayoutY(450);
		p8.getStyleClass().add("scoretext");
		
		p9 = new Label(pts.get(8));
		p9.setLayoutX(420);
		p9.setLayoutY(495);
		p9.getStyleClass().add("scoretext");
		
		p10 = new Label(pts.get(9));
		p10.setLayoutX(420);
		p10.setLayoutY(540);
		p10.getStyleClass().add("scoretext");
		
    	Group group = new Group();
    	group.getChildren().addAll(point,title,returnmain);
    	group.getChildren().addAll(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11);
    	group.getChildren().addAll(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
    	
    	Scene hs = new Scene(group,600,800);
    	hs.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
    	
    	Stage scorepage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		scorepage.setScene(hs);
		scorepage.show();
    }
    
    @FXML
    private void exit(ActionEvent event) throws IOException {
    	Pane confirm = FXMLLoader.load(getClass().getResource("confirm.fxml"));
    	Scene sure = new Scene(confirm);
    	sure.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
    	Stage confirmpage = new Stage();
    	confirmpage.setX(520);
    	confirmpage.setY(300);
    	confirmpage.initStyle(StageStyle.UNDECORATED);
    	confirmpage.setScene(sure);
    	confirmpage.show();
    }
    
    //background process
    public void createTimer() {
    	save = new saveScore();
    	timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
            	if (animal.changeScore()) {
            		setNumber(animal.getPoints());
            	}
            	if (animal.getStop()) {
            		try {
            			saveScore.savefile(animal.getPoints());
            		} catch (IOException ioe){
            			
            		}
            		//save.savefile(animal.getPoints());
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
}
