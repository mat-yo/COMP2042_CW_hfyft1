package application;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ScoreModel {
	Image img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11;
    ImageView i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11;
    Label p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
	
    /**
	 * Create new pane for scoreboard
	 */
	public Pane getPane() {
		Pane point = new Pane();
		return point;
	}
	
	/**
	 * Create title
	 */
	public Label getLabel() {
		Label title = new Label("High Score");
		return title;
	}
	
	/**
	 * Create retun to menu button
	 */
	public Button getBackButton() {
		Button returnmain = new Button("Back");
		return returnmain;
	}
	
	/**
	 * Create images to display digit
	 */
	public ImageView getI1() {
		img1 = new Image("file:resources/number/1.png", 40, 40, true, true);
		i1 = new ImageView(img1);
		return i1;
	}
	
	public ImageView getI2() {
		img2 = new Image("file:resources/number/2.png", 40, 40, true, true);
		i2 = new ImageView(img2);
		return i2;
	}
	
	public ImageView getI3() {
		img3 = new Image("file:resources/number/3.png", 40, 40, true, true);
		i3= new ImageView(img3);
		return i3;
	}
	
	public ImageView getI4() {
		img4 = new Image("file:resources/number/4.png", 40, 40, true, true);
		i4 = new ImageView(img4);
		return i4;
	}
	
	public ImageView getI5() {
		img5 = new Image("file:resources/number/5.png", 40, 40, true, true);
		i5 = new ImageView(img5);
		return i5;
	}
	
	public ImageView getI6() {
		img6 = new Image("file:resources/number/6.png", 40, 40, true, true);
		i6 = new ImageView(img6);
		return i6;
	}
	
	public ImageView getI7() {
		img7 = new Image("file:resources/number/7.png", 40, 40, true, true);
		i7 = new ImageView(img7);
		return i7;
	}
	
	public ImageView getI8() {
		img8 = new Image("file:resources/number/8.png", 40, 40, true, true);
		i8 = new ImageView(img8);
		return i8;
	}
	
	public ImageView getI9() {
		img9 = new Image("file:resources/number/9.png", 40, 40, true, true);
		i9 = new ImageView(img9);
		return i9;
	}
	
	public ImageView getI10() {
		img10 = new Image("file:resources/number/0.png", 40, 40, true, true);
		i10 = new ImageView(img10);
		return i10;
	}
	
	public ImageView getI11() {
		img11 = new Image("file:resources/number/1.png", 40, 40, true, true);
		i11 = new ImageView(img11);
		return i11;
	}
	
	/**
	 * Create labels to display scores
	 */
	public Label getP1(ArrayList pts) {
		p1 = new Label((String) pts.get(0));
		return p1;
	}
	
	public Label getP2(ArrayList pts) {
		p2 = new Label((String) pts.get(1));
		return p2;
	}
	
	public Label getP3(ArrayList pts) {
		p3 = new Label((String) pts.get(2));
		return p3;
	}
	
	public Label getP4(ArrayList pts) {
		p4 = new Label((String) pts.get(3));
		return p4;
	}
	
	public Label getP5(ArrayList pts) {
		p5 = new Label((String) pts.get(4));
		return p5;
	}
	
	public Label getP6(ArrayList pts) {
		p6 = new Label((String) pts.get(5));
		return p6;
	}
	
	public Label getP7(ArrayList pts) {
		p7 = new Label((String) pts.get(6));
		return p7;
	}
	
	public Label getP8(ArrayList pts) {
		p8 = new Label((String) pts.get(7));
		return p8;
	}
	
	public Label getP9(ArrayList pts) {
		p9 = new Label((String) pts.get(8));
		return p9;
	}
	
	public Label getP10(ArrayList pts) {
		p10 = new Label((String) pts.get(9));
		return p10;
	}
	
	/**
	 * Create a group to combine the objects
	 */
	public Group getGroup() {
		Group group = new Group();
		return group;
	}
	
	/**
	 * Create new scene for scoreboard
	 */
	public Scene getScoreScene(Group group) {
		Scene hs = new Scene(group,600,800);
		hs.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		return hs;
	}
	
	/**
	 * Create stage for scoreboard
	 */
	public Stage getScoreStage(ActionEvent event) {
		Stage scorepage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		return scorepage;
	}
	
	/**
	 * Create new scene main menu
	 */
	public Scene getBackMainScene(Pane main) {
		Scene gomain = new Scene(main);
		gomain.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		return gomain;
	}
	
	/**
	 * Create stage for main menu
	 */
	public Stage getbackMainStage(ActionEvent event) {
		Stage menupage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		return menupage;
	}
}
