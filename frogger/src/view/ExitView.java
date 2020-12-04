package view;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ExitView {
	/**
	 * Set exit pop up stage
	 */
	public void setExitStage(Stage confirmpage, Scene sure) {
		confirmpage.setX(520);
    	confirmpage.setY(300);
    	confirmpage.initStyle(StageStyle.UNDECORATED);
    	confirmpage.setScene(sure);
    	confirmpage.show();
	}
}
