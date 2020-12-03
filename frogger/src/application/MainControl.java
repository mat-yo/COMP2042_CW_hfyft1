package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.layout.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.event.ActionEvent;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.Group;

import actor.Animal;
import actor.BackgroundImage;
import actor.Digit;
import world.MyStage;

import javafx.animation.AnimationTimer;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;

public class MainControl {
	@FXML
	private Pane tutpage;
	
	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private MyStage background;
        
    @FXML 
    AnimationTimer timer;
    SaveScore save;
    
    @FXML
    private BackgroundImage froggerback;
    private Animal animal;
    private Button backmain;
    private Scene scene;
    private ImageView i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11;
    private Label p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
    
    @FXML
    private void game(ActionEvent event) throws IOException {
    	background = new MyStage();  	
    	
    	GameModel gm = new GameModel();
    	GameView gv = new GameView();
    	
    	froggerback = gm.getGameBack(background);
    	scene = gm.getGameScene(background);
    	animal = gm.getAnimal();
    	backmain = gm.getBackButton();

    	gv.setGameBack(background, froggerback);
    	gv.setGameScene(background);
    	gv.setAnimal(background, animal);
    	gv.setBackButton(background, backmain);
		
		Pane main = FXMLLoader.load(getClass().getResource("main.fxml"));
		Scene returnmain = gm.getBackMainScene(main);
		Stage menupage = gm.getBackMainStage(event);
		
		backmain.setOnAction(e -> {gv.setBackMenuScene(returnmain, menupage);background.stopMusic();});
		
		background.start();
		
		Stage primaryStage = gm.getGameStage(event);
		gv.setGameStage(primaryStage, scene);
		start();
    }

	@FXML
    private void tutorial(ActionEvent event) throws IOException {
    	Pane learn = FXMLLoader.load(getClass().getResource("tutorial.fxml"));
    	
    	TutorialModel tm = new TutorialModel();
    	TutorialView tv = new TutorialView();
    	
    	Scene tut = tm.getTut(learn);
    	Stage tutorialpage = tm.getTutStage(event);
    	
    	tv.setTutStage(tutorialpage, tut);
    }
    
    @FXML
    private void score(ActionEvent event) throws IOException {
    	ScoreModel sm = new ScoreModel();
    	ScoreView sv = new ScoreView();
    	
    	Pane point = sm.getPane();
    	Label title = sm.getLabel();
    	Button returnmain = sm.getBackButton();
    	Group group = sm.getGroup();
    	i1 = sm.getI1();
    	i2 = sm.getI2();
    	i3 = sm.getI3();
    	i4 = sm.getI4();
    	i5 = sm.getI5();
    	i6 = sm.getI6();
    	i7 = sm.getI7();
    	i8 = sm.getI8();
    	i9 = sm.getI9();
    	i10 = sm.getI10();
    	i11 = sm.getI11();
    	
    	sv.setPane(point);
    	sv.setLabel(title);
    	sv.setBackButton(returnmain);
    	
    	sv.setI1(i1);
    	sv.setI2(i2);
    	sv.setI3(i3);
    	sv.setI4(i4);
    	sv.setI5(i5);
    	sv.setI6(i6);
    	sv.setI7(i7);
    	sv.setI8(i8);
    	sv.setI9(i9);
    	sv.setI10(i10);
    	sv.setI11(i11);
    	
    	ArrayList<Integer> pts1 = new ArrayList<>();
    	ArrayList<String> pts2 = new ArrayList<>();
		File score = new File("highscores.txt");
		try {
			Scanner readscore = new Scanner(score);
			while(readscore.hasNextLine()) {
				String data = readscore.nextLine();
				pts1.add(Integer.parseInt(data));
			}
			readscore.close();
		} catch(FileNotFoundException e) {}
		
		Collections.sort(pts1);
		Collections.reverse(pts1);
		
		for (int i=0;i<pts1.size();i++) {
			pts2.add(Integer.toString(pts1.get(i)));
		}
		
		p1 = sm.getP1(pts2);
    	p2 = sm.getP2(pts2);
    	p3 = sm.getP3(pts2);
    	p4 = sm.getP4(pts2);
    	p5 = sm.getP5(pts2);
    	p6 = sm.getP6(pts2);
    	p7 = sm.getP7(pts2);
    	p8 = sm.getP8(pts2);
    	p9 = sm.getP9(pts2);
    	p10 = sm.getP10(pts2);
    	
		sv.setP1(p1);
    	sv.setP2(p2);
    	sv.setP3(p3);
    	sv.setP4(p4);
    	sv.setP5(p5);
    	sv.setP6(p6);
    	sv.setP7(p7);
    	sv.setP8(p8);
    	sv.setP9(p9);
    	sv.setP10(p10);
    	
    	sv.setGroup(group, point, title, returnmain);
    	sv.setGroupImg1(group, i1, i2, i3, i4, i5);
    	sv.setGroupImg2(group, i6, i7, i8, i9, i10, i11);
    	sv.setGroupPts1(group, p1, p2, p3, p4, p5);
    	sv.setGroupPts2(group, p6, p7, p8, p9, p10);
    	
    	Pane main = FXMLLoader.load(getClass().getResource("main.fxml"));
    	Scene gomain = sm.getBackMainScene(main);
    	Stage menupage = sm.getbackMainStage(event);
		returnmain.setOnAction(e -> sv.setBackMainScene(menupage, gomain));
    	
		Scene hs = sm.getScoreScene(group);
		Stage scorepage = sm.getScoreStage(event);
		
		sv.setScoreScene(scorepage, hs);
    }
    
    @FXML
    private void exit(ActionEvent event) throws IOException {
    	Pane confirm = FXMLLoader.load(getClass().getResource("confirm.fxml"));
    	
    	ExitModel em = new ExitModel();
    	ExitView ev = new ExitView();
    	
    	Scene sure = em.setExitScene(confirm);
    	Stage confirmpage = em.setExitStage();
    	ev.setExitStage(confirmpage, sure);
    }
    
    //background process
    public void createTimer() {
    	save = new SaveScore();
    	timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
            	if (animal.changeScore()) {
            		setNumber(animal.getPoints());
            	}
            	if (animal.getStop()) {
            		try {
            			SaveScore.savefile(animal.getPoints());
            		} catch (IOException ioe){
            			
            		}
            		background.stopMusic();
            		stop();
            		background.stop();
            		Alert alert = new Alert(AlertType.INFORMATION);
            		alert.setTitle("You Have Won The Game!");
            		alert.setHeaderText("Your High Score: "+animal.getPoints()+"!");
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
