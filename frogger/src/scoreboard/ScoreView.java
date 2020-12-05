package scoreboard;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ScoreView {
	/**
	 * Set pane for scoreboard
	 */
    public void setPane(Pane point) {
    	point.setPrefHeight(800);
    	point.setPrefWidth(600);
    	point.getStyleClass().add("scorebackground");
    }
    
    /**
	 * Set title
	 */
    public void setLabel(Label title) {
    	title.getStyleClass().add("scoretitle");
    	title.setLayoutX(235);
    	title.setLayoutY(95);
    }
    
    /**
	 * Set button
	 */
    public void setBackButton(Button returnmain) {
    	returnmain.setLayoutX(220);
    	returnmain.setLayoutY(700);
    	returnmain.setPrefHeight(40);
    	returnmain.setPrefWidth(160);
    	returnmain.getStyleClass().add("tutbutton");
    }
    
    /**
	 * Set numbers
	 */
    public void setI1(ImageView i1) {
		i1.setLayoutX(150);
		i1.setLayoutY(135);
    }
    
    public void setI2(ImageView i2) {
    	i2.setLayoutX(150);
		i2.setLayoutY(180);
    }
    
    public void setI3(ImageView i3) {
    	i3.setLayoutX(150);
		i3.setLayoutY(225);
    }
    
	public void setI4(ImageView i4) {
		i4.setLayoutX(150);
		i4.setLayoutY(270);
	}
	
	public void setI5(ImageView i5) {
		i5.setLayoutX(150);
		i5.setLayoutY(315);
	}
	
	public void setI6(ImageView i6) {
		i6.setLayoutX(150);
		i6.setLayoutY(360);
	}
    
	public void setI7(ImageView i7) {
		i7.setLayoutX(150);
		i7.setLayoutY(405);
	}
	
	public void setI8(ImageView i8) {
		i8.setLayoutX(150);
		i8.setLayoutY(450);
	}
	
	public void setI9(ImageView i9) {
		i9.setLayoutX(150);
		i9.setLayoutY(495);
	}
	
	public void setI10(ImageView i10) {
		i10.setLayoutX(150);
		i10.setLayoutY(540);
	}
	
	public void setI11(ImageView i11) {
		i11.setLayoutX(110);
		i11.setLayoutY(540);
	}
	
	/**
	 * Set the scores
	 */
	public void setP1(Label p1) {
		p1.setLayoutX(420);
		p1.setLayoutY(135);
		p1.getStyleClass().add("scoretext");
	}
	
	public void setP2(Label p2) {
		p2.setLayoutX(420);
		p2.setLayoutY(180);
		p2.getStyleClass().add("scoretext");
	}
	
	public void setP3(Label p3) {
		p3.setLayoutX(420);
		p3.setLayoutY(225);
		p3.getStyleClass().add("scoretext");
	}
	
	public void setP4(Label p4) {
		p4.setLayoutX(420);
		p4.setLayoutY(270);
		p4.getStyleClass().add("scoretext");
	}
	
	public void setP5(Label p5) {
		p5.setLayoutX(420);
		p5.setLayoutY(315);
		p5.getStyleClass().add("scoretext");
	}
	
	public void setP6(Label p6) {
		p6.setLayoutX(420);
		p6.setLayoutY(360);
		p6.getStyleClass().add("scoretext");
	}
	
	public void setP7(Label p7) {
		p7.setLayoutX(420);
		p7.setLayoutY(405);
		p7.getStyleClass().add("scoretext");
	}
	
	public void setP8(Label p8) {
		p8.setLayoutX(420);
		p8.setLayoutY(450);
		p8.getStyleClass().add("scoretext");
	}
	
	public void setP9(Label p9) {
		p9.setLayoutX(420);
		p9.setLayoutY(495);
		p9.getStyleClass().add("scoretext");
	}
	
	public void setP10(Label p10) {
		p10.setLayoutX(420);
		p10.setLayoutY(540);
		p10.getStyleClass().add("scoretext");
	}
	
	/**
	 * Set number, title, button and scores into groups
	 */
	public void setGroup(Group group, Pane point, Label title, Button returnmain) {
		group.getChildren().addAll(point,title,returnmain);    	
	}
	
	public void setGroupImg1(Group group, ImageView i1, ImageView i2, ImageView i3, ImageView i4, ImageView i5) {
		group.getChildren().addAll(i1, i2, i3, i4, i5);
	}
    
	public void setGroupImg2(Group group, ImageView i6, ImageView i7, ImageView i8, ImageView i9, ImageView i10, ImageView i11) {
		group.getChildren().addAll(i6, i7, i8, i9, i10, i11);
	}
	
	public void setGroupPts1(Group group, Label p1, Label p2, Label p3, Label p4, Label p5) {
		group.getChildren().addAll(p1, p2, p3, p4, p5);
	}
	
	public void setGroupPts2(Group group, Label p6, Label p7, Label p8, Label p9, Label p10) {
		group.getChildren().addAll(p6, p7, p8, p9, p10);
	}
	
	/**
	 * Set scoreboard scene
	 */
	public void setScoreScene(Stage scorepage, Scene hs) {
		scorepage.setScene(hs);
		scorepage.show();
	}
	
	/**
	 * Set main menu scene
	 */
	public void setBackMainScene(Stage menupage, Scene gomain) {
		menupage.setScene(gomain);
	}
}
