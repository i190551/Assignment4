package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class FullLayoutDisplay {

	 @FXML
	    private Button menssection;

	    @FXML
	    private Button girlssection;

	    @FXML
	    private Button martsection;

	    @FXML
	    private Button kids_button;

	    @FXML
	    void Open_kids_section(ActionEvent event) throws IOException {
	    	Main m = new Main();
	    	
	    	m.changeScene("/FXML/Kids.fxml", "Kids Collection");


	    }

	    @FXML
	    void open_girls_section(ActionEvent event) throws IOException {
	    	Main m = new Main();
	    	m.changeScene("/FXML/Women.fxml", "Women Collection");


	    }

	    @FXML
	    void open_mart_section(ActionEvent event) {

	    }

	    @FXML
	    void open_mens_section(ActionEvent event) throws IOException {
	    	
	    	Main m = new Main();
	    	m.changeScene("/FXML/Mens.fxml", "Men Collection");


	    }
	    

	    @FXML
	    void towallet(ActionEvent event) throws IOException {
	    	
	    	Main m = new Main();
	    	m.changeScene("/FXML/Wallet.fxml", "My Wallet");

	    }
	    

	    @FXML
	    void becomemember(ActionEvent event) {

	    }
	    
	    @FXML
	    void cancelorder(ActionEvent event) throws IOException {
	    	
	    	Main m = new Main();
	    	m.changeScene("/FXML/CancelOrder.fxml", "Cancel Request");

	    }

}
