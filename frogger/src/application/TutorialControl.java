package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.layout.*;
import java.io.IOException;
import javafx.event.ActionEvent;

import javafx.stage.Stage;
import javafx.scene.Scene;

public class TutorialControl {
	@FXML
	private Pane tutpage;
	
	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private void tut_to_menu(ActionEvent event) throws IOException {
    	Pane main = FXMLLoader.load(getClass().getResource("main.fxml"));
    	
    	TutorialModel tm = new TutorialModel();
    	TutorialView tv = new TutorialView();
    	
    	Scene menu = tm.getBackMainScene(main);
    	Stage mainpage = tm.getBackMainStage(event);
    	
    	tv.setBackMainScene(mainpage, menu);
    }
}
