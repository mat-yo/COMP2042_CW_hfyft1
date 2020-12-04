package application;

import javafx.fxml.FXML;

import java.io.IOException;
import javafx.event.ActionEvent;

import javafx.stage.Stage;
import javafx.application.*;

import javafx.scene.control.Button;

public class ConfirmControl {
	@FXML
	Button closeButton;
    
    /**
	 * Close the application is "yes" button is clicked
	 */
    @FXML
    private void quit(ActionEvent event) throws IOException {
    	Platform.exit();
    }
    
    /**
	 * Close the confirm quit popup if "no" button is clicked
	 */
    @FXML
    private void conf_to_menu(ActionEvent event) throws IOException {
    	Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}
