package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Kids {

    @FXML
    private Button kids_back;

    @FXML
    void open_maincreen_from_kids(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("/FXML/FullLayoutDisplay.fxml", "Home");


    }
    
    @FXML
    void butshirt(ActionEvent event) {

    }

    @FXML
    void buyfrock(ActionEvent event) {

    }

    @FXML
    void buykurta(ActionEvent event) {

    }

    @FXML
    void buysweater(ActionEvent event) {

    }

}
