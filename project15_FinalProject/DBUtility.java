/**
 * Name: Arjina Khanom
 * CST 3613
 * Final Project
 * Assignment - 15
 * Due Date: Tuesday, May 19, 2020 At 6:00 PM
 **/

package ArjinaSfinalProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class DBUtility {
	
	 static void connectToDB() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("Driver loaded");
		
			// Establish a connection
			Connection connection = DriverManager.getConnection ("jdbc:sqlserver://s16988308.onlinehome-server.com:1433; databaseName=CUNY_DB;integratedSecurity=false;","cst3613", "password1");	  
			System.out.println("Database connected");			  	  
		   } 
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	/*static TextArea txResult = new TextArea();
	 * final Label lblMessage = new Label();
	 * static void initializedDB() throws ClassNotFoundException, SQLException {
	    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    Connection connection = DriverManager.getConnection("jdbc:sqlserver://s16988308.onlinehome-server.com:1433;databaseName=CUNY_DB;integratedSecurity=false;", "cst3613", "password1");

	    Statement statement = connection.createStatement();   
	    String queryString = "select courseID, title, numOfCredits from dbo.Course where courseID in (select courseid from dbo.Enrollment where ssn=234567891);";
	    ResultSet resultSet = statement.executeQuery("SELECT courseID, title, numOfCredits from dbo.Course where courseID in (select courseid from dbo.Enrollment where ssn=234567891);");
	    txResult.setText("| Course Id |\t  " + "| Title |\t " + "| Credits |\t" + "\n");
	    
	    while (resultSet.next()) {
	        txResult.appendText(resultSet.getString(1) + "   \t " + resultSet.getString(2) + "   \t " + resultSet.getString(3) + "\n");      
	    }
	}*/
	
}