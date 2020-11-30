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
import javafx.scene.Node;
import javafx.scene.Parent;

public class tutorialControl {
	@FXML
	private Pane tutpage;
	//private Stage lol;
	
	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private void tut_to_menu(ActionEvent event) throws IOException {
    	Pane main = FXMLLoader.load(getClass().getResource("main.fxml"));
    	Scene menu = new Scene(main);
    	menu.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
    	
    	Stage mainpage = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	mainpage.setScene(menu);
    	mainpage.show();
    }
}
