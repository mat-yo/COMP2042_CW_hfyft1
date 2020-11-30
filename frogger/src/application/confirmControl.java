package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;

import javafx.scene.layout.*;
import java.io.IOException;
import javafx.event.ActionEvent;

import javafx.stage.Stage;
import javafx.application.*;

import javafx.scene.control.Button;

public class confirmControl {
	@FXML Button closeButton;
	
	@FXML
	private Pane tutpage;
	//private Stage lol;
	
	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private void quit(ActionEvent event) throws IOException {
    	Platform.exit();
    }
    

    @FXML
    private void conf_to_menu(ActionEvent event) throws IOException {
    	Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}
