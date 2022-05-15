package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class Women {

    @FXML
    private Button women_back;


    
    @FXML
    void back_women(ActionEvent event) throws IOException {

    	Main m = new Main();
    	m.changeScene("/FXML/FullLayoutDisplay.fxml", "Home");
    }
    
    @FXML
    void buyAcc(ActionEvent event) {

    }

    @FXML
    void buymaxi(ActionEvent event) {

    }

    @FXML
    void buyredskirt(ActionEvent event) {

    }

    @FXML
    void buyskirt(ActionEvent event) {

    }
    
    @FXML
    private TextField address3;

    @FXML
    private RadioButton cashondelivery3;

    @FXML
    private RadioButton bank3;

    @FXML
    private RadioButton wallet3;

    @FXML
    private TextField cell3;

    @FXML
    void back_payment3(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("/FXML/FullLayoutDisplay.fxml", "Home");

    }

    @FXML
    void pay3(ActionEvent event) {

    }

}
