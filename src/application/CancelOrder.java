package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connectiondb.dbhandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Window;

public class CancelOrder {
	
	
	private dbhandler handler=new dbhandler();
    private Connection connection;
    private PreparedStatement pst;
	
	

    @FXML
    private TextField orderid;

    @FXML
    private TextField reasoncancel;
    
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
    void back_cancel(ActionEvent event) throws IOException {
    	

    	Main m = new Main();
    	m.changeScene("/FXML/FullLayoutDisplay.fxml", "Home");

    }

    @FXML
    void cancelsubmit(ActionEvent event) throws IOException {
    	int i=Integer.parseInt(orderid.getText());  
    	
    	showAlert1(Alert.AlertType.INFORMATION,null, "Cancel Request!",
                "Your request for the cancellation has been forwared, you will be updated soon! ");
    	
    	String insert="delete from orders where idorders=?";
		
		connection = handler.getConnection(); 
		try {
			pst=connection.prepareStatement(insert);
		}catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		try {
			
			pst.setInt(1,i);
			pst.executeUpdate();
			
		
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		
    	

    	Main m = new Main();
    	m.changeScene("/FXML/FullLayoutDisplay.fxml", "Home");

    }

}
