package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Men {

    @FXML
    private Button men_back;

    @FXML
    void back_to_main_from_men(ActionEvent event) throws IOException {
    	

    	Main m = new Main();
    	m.changeScene("/FXML/FullLayoutDisplay.fxml", "Home");

    }
    
    @FXML
    void buyTshirt(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("/FXML/Payment.fxml", "Payment Procedure");

    }

    @FXML
    void buyfullshirt(ActionEvent event) {

    }

    @FXML
    void buyjacket(ActionEvent event) {

    }

    @FXML
    void buysuit(ActionEvent event) {

    }

}
