package view;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class TutorialView {
	/**
	 * Set tutorial stage
	 */
	public void setTutStage(Stage tutorialpage, Scene tut) {
		tutorialpage.setScene(tut);
    	tutorialpage.show();
	}
	
	/**
	 * Set main menu scene
	 */
	public void setBackMainScene(Stage mainpage, Scene menu) {
		mainpage.setScene(menu);
    	mainpage.show();
	}
}
