package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connectiondb.dbhandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Window;

public class Wallet {
	private dbhandler handler=new dbhandler();
    private Connection connection;
    private PreparedStatement pst;
    
    

    @FXML
    private TextField walletemail;

    @FXML
    private PasswordField walletpassword;
    
    @FXML
    private TextField walletacc;

    @FXML
    private RadioButton wallet3000;

    @FXML
    private RadioButton wallet5000;

    @FXML
    private RadioButton wallet10000;

    @FXML
    private RadioButton wallet20000;
    
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
    void backwallet2(ActionEvent event) throws IOException {
    	

    	Main m = new Main();
    	m.changeScene("/FXML/FullLayoutDisplay.fxml", "Home");

    }

    @FXML
    void transfertowallet(ActionEvent event) throws IOException {
    	
    	if(walletacc.getText().length()<9)
    	{
    		showAlert1(Alert.AlertType.ERROR,null, "Invalid Credential!",
                    "Error, enter a valid account number (9 digits)");

    	}
    	else
    	{
    		showAlert1(Alert.AlertType.CONFIRMATION,null, "Transaction Successful!",
                "Transaction Successful, The wallet will be updated in a While");
    		

        	Main m = new Main();
        	m.changeScene("/FXML/FullLayoutDisplay.fxml", "Home");
    	}
    }

    @FXML
    void LoginWallet(ActionEvent event) throws IOException {
    	
    	
    	String email=walletemail.getText();
    	
    	connection=handler.getConnection();
    	String auth="Select * from users where email=? and password=?";
    	
    
    	try {
    	pst = connection.prepareStatement(auth);
    	pst.setString(1,walletemail.getText());
    	pst.setString(2, walletpassword.getText());
    	
    	ResultSet rs=pst.executeQuery();
    	
    	int count=0;
    	while(rs.next())
    	{
    		count=count+1;
    	}
    	
    	if(count==1)
    	{
    		System.out.print("Login Successful");
    		

        	Main m=new Main();
           	m.changeScene("/FXML/WalletLayout.fxml", "My Wallet");
    	}
    	else if((email.indexOf("@")==-1))
    	{

    		showAlert1(Alert.AlertType.ERROR,null, "Error!",
	                 "Invalid Email, Must Contains @ (for example: @gmail.com)");
    	}
    	else
    	{
    		showAlert1(Alert.AlertType.ERROR,null, "Error!",
	                 "Invalid Email or Password, Signup to Register");
    		
    		
    	}
    	}catch(SQLException e)
    	{
    		e.printStackTrace();
    	}
    		
    	finally
    	{
    		try
    		{
    			connection.close();
    		}catch(SQLException e)
    		{
    			e.printStackTrace();
    		}
    	}

		

 
    }

    @FXML
    void backwallet(ActionEvent event) throws IOException {
    	
    	Main m = new Main();
    	m.changeScene("/FXML/FullLayoutDisplay.fxml", "Home");

    }

}
