package application;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class TutorialView {
	public void setTutStage(Stage tutorialpage, Scene tut) {
		tutorialpage.setScene(tut);
    	tutorialpage.show();
	}
	
	public void setBackMainScene(Stage mainpage, Scene menu) {
		mainpage.setScene(menu);
    	mainpage.show();
	}
}
