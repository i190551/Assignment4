package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import java.util.ResourceBundle;

import connectiondb.dbhandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Window;

public class PaymentforWomen {
	
	private dbhandler handler=new dbhandler();
    private Connection connection;
    private PreparedStatement pst;

 

    @FXML
    private TextField address1;

    @FXML
    private RadioButton cashondelivery1;

    @FXML
    private RadioButton bank1;

    @FXML
    private RadioButton wallet1;

    @FXML
    private TextField cell1;
    
    @FXML
    private TextField address2;

    @FXML
    private RadioButton cashondelivery2;

    @FXML
    private RadioButton bank2;

    @FXML
    private RadioButton wallet2;

    @FXML
    private TextField cell2;
    
    @FXML
    private TextField address4;

    @FXML
    private RadioButton cashondelivery4;

    @FXML
    private RadioButton bank4;

    @FXML
    private RadioButton wallet4;

    @FXML
    private TextField cell4;
    
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
    
    private void showAlert1(AlertType error, Window owner, String string, String string2) {
 		// TODO Auto-generated method stub
 		 Alert alert = new Alert(error);
 	        alert.setTitle(string);
 	        alert.setHeaderText(null);
 	        alert.setContentText(string2);
 	        alert.initOwner(owner);
 	        alert.show();
    }
 	

    @FXML
    void back_payment3(ActionEvent event) throws IOException {
    	
    	

    	Main m = new Main();
    	m.changeScene("/FXML/Women.fxml", "Women Collection");

    }

    @FXML
    void pay3(ActionEvent event) {

    }

    @FXML
    void back_payment4(ActionEvent event) throws IOException {

    	Main m = new Main();
    	m.changeScene("/FXML/Women.fxml", "Women Collection");
    	

    }

    @FXML
    void pay4(ActionEvent event) {

    }

    @FXML
    void back_payment2(ActionEvent event) throws IOException {

    	Main m = new Main();
    	m.changeScene("/FXML/Women.fxml", "Women Collection");

    }

    @FXML
    void pay2(ActionEvent event) {

    }

    @FXML
    void back_payment1(ActionEvent event) throws IOException {
    	

    	Main m = new Main();
    	m.changeScene("/FXML/Women.fxml", "Women Collection");
    	

    }

    @FXML
    void pay1(ActionEvent event) throws IOException {
    	if(cell1.getText().length()<11)
    	{
        	
        	showAlert1(Alert.AlertType.ERROR,null, "Error!",
                    "Invalid Contact Number, Kindly provide a correct contact number! ");
        	
        	

    	}
    	
    	else
    	{
    		Random rnd = new Random();
    		int number = rnd. nextInt(999999);
        	showAlert1(Alert.AlertType.CONFIRMATION,null, "Booked!",
                    "Your order has been booked. You will be sent an email for confirmation. Your order number is "+ number );
        	
        	String insert="INSERT INTO orders(idorders)"+"VALUES(?)";
    		
    		connection = handler.getConnection(); 
    		try {
    			pst=connection.prepareStatement(insert);
    		}catch (SQLException e)
    		{
    			e.printStackTrace();
    		}
    		
    		try {
    			
    			pst.setInt(1,number);
    			pst.executeUpdate();
    			
    		
    		}catch(SQLException e)
    		{
    			e.printStackTrace();
    		}
    		

        	
        	Main m=new Main();

        	m.changeScene("/FXML/FullLayoutDisplay.fxml", "Home");
    	}


    }

 
}
