
/**
 * Name: Arjina Khanom
 * CST 3613
 * Assignment - 14
 * Due Date: Tuesday, May 12, 2020 at 6:00 PM
 * Question: Only using JavaFX framework, your program should ask user to enter the database ID and password 
 * and return your courses enrolled in listbox. 
 * The login Id and password is the database ID and password. The courses enrolled is only your courses.
 */

package Database;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.sql.*;

public class project14 extends Application {
	// Statement for executing queries
	Label Login = new Label("Login ID:");
	TextField LoginTxt = new TextField();
	Label Password = new Label("Password:");
	Label course = new Label("Courses:");
	
	TextArea text = new TextArea("");
	PasswordField Passwordtxt = new PasswordField();
	Button Btn = new Button ("Login");
	ListView LstView = new ListView();
	
	private static PreparedStatement preparedStatement;
	
	public static void main (String[] args)
	{
		launch(args);
	}
public void start (Stage primaryStage) throws Exception {
	GridPane root = new GridPane();
	
	root.setPadding(new Insets(20));
	root.setHgap(25);
	root.setVgap(15);
	
	GridPane.setHalignment (Login, HPos.RIGHT);
	root.add(Login,  0,  1);
	
	GridPane.setHalignment(Password, HPos.RIGHT);
	root.add(Password,  0,  2);
	
	GridPane.setHalignment(LoginTxt, HPos.LEFT);
	root.add(LoginTxt,  1,  1);
	
	GridPane.setHalignment(Passwordtxt, HPos.LEFT);
	root.add(Passwordtxt,  1,  2);
	
	GridPane.setHalignment (Btn, HPos.RIGHT);
	root.add(Btn,  1,  3);
	
	GridPane.setHalignment(course, HPos.LEFT);
	root.add(course,  1,  5);
	
	GridPane.setHalignment(LstView, HPos.LEFT);
	root.add(LstView,  1,  6);
	
	Scene scene = new Scene(root, 400, 400);
	
	primaryStage.setTitle("Project14");
	
	primaryStage.setScene(scene);
	
	primaryStage.show();
	
	// after the frame
	
	Btn.setOnAction(e ->  {
		try { 
			initializedDB();
		}
		catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
	});
}

private void initializedDB() throws ClassNotFoundException, SQLException {
	// Load the JDBC driver
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	 System.out.println("Driver loaded");
	 
	 // Establish a connection
	  Connection connection = DriverManager.getConnection ("jdbc:sqlserver://s16988308.onlinehome-server.com:1433; databaseName=CUNY_DB;integratedSecurity=false;", "cst3613", "password1");	  
	  System.out.println("Database connected");
	  
	  String queryString ="select courseID, subjectID, courseNumber, title, numOfCredits from Course";
	   
	// Create a statement
	  preparedStatement = connection.prepareStatement (queryString);
	  try {
		  ResultSet reset = preparedStatement.executeQuery();
		  
		  if (reset.next()) {
			  String CourseID = reset.getString(1);
			  String SubjectID = reset.getString(2);
			  int CourseNumber = reset.getInt(3);
			  String title = reset.getString(4);
			  int Credit = reset.getInt(5);
			  
			  if (LoginTxt.getText().isEmpty() || Passwordtxt.getText().isEmpty())
			  {
				  LstView.getItems().clear();
			  }
			  else LstView.getItems().clear();
			  
		  }
		  reset.close();
	      }
	catch  (SQLException ex) {
		ex.printStackTrace();
	}
	  connection.close();
	  System.out.println("Dtabase closed.");
	 //keyboard closed 	
}
private void Login () {
	if (LoginTxt.getText().isEmpty() || Passwordtxt.getText().isEmpty())
	{
		LstView.getItems().clear();
	}
	else if (LoginTxt.getText().matches("cst3613") && Passwordtxt.getText().matches("password1") && LstView.getItems().isEmpty())
	{
		LstView.getItems().add("CST3613-Application Development with Database, 3 credits\n 001-Intro.Java-3");
	}
	else LstView.getItems().clear();
	{
		//empty statement
	}	
}
//ending;
			
}


