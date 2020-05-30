/**
 * Name: Arjina Khanom
 * CST 3613
 * Final Project
 * Assignment - 15
 * Due Date: Tuesday, May 19, 2020 At 6:00 PM
 **/

package ArjinaSfinalProject;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyClasses extends Application {
static TextArea txResult = new TextArea();
final Label lblMessage1 = new Label();
final Label lblMessage2 = new Label();

public void start(Stage secondaryStage) throws Exception { 
	lblMessage1.setText("Welcome Arjina Khanom!");
    lblMessage2.setText("Your all enrolled classes are listed below.");
        VBox layout = new VBox(10);
        layout.getChildren().addAll(lblMessage1, lblMessage2); 
        
       //Manage classes menu
        Menu mainMenu = new Menu("Manage Classes");
        MenuItem menuItem1 = new MenuItem("Add");
        MenuItem menuItem2 = new MenuItem("Remove");
        
        mainMenu.getItems().add(menuItem1);
        mainMenu.getItems().add(menuItem2);
        
        menuItem1.setOnAction(e -> Register.display("Register", "What class do you want to add"));
        menuItem2.setOnAction(e -> AlertBox.display("Alert Box", "Are you sure you want to delete this class? Yes/No"));
        
       
      //Exit menu
        Menu exitMenu = new Menu("Exit");
        exitMenu.getItems().add(new MenuItem("Exit"));
        exitMenu.setOnAction(e -> Platform.exit());
        
      //Main menu bar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(mainMenu, exitMenu);
        
        try {
        	//DBUtility.initializedDB();
        	initializedDB();
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
          
        Button btAdd = new Button("Add");
        btAdd.setOnAction(e -> Register.display("Register", "What class do you want to add"));	
        
       Button btRemove = new Button("Remove");
       btRemove.setOnAction(e -> AlertBox.display("Alert Box", "Are you sure you want to delete this class? Yes/No"));
        
       Button btExit = new Button("Exit");
       btExit.setOnAction(e -> Platform.exit());
       
       HBox hbox = new HBox(50);
       hbox.getChildren().addAll(btRemove, btAdd);
       hbox.setAlignment(Pos.CENTER);
       
       HBox operatorsPane = new HBox(10);
       BorderPane borderPane = new BorderPane(layout);
       BorderPane.setMargin(operatorsPane, new Insets(40, 40, 40, 40));
       borderPane.setTop(menuBar);
       layout.getChildren().addAll(txResult, hbox, btExit);
       
        
      BorderPane.setMargin(layout, new Insets(100, 150, 150, 150));
      secondaryStage.setScene(new Scene(borderPane, borderPane.getPrefWidth(), borderPane.getPrefWidth()));
    
      layout.setAlignment(Pos.CENTER);
      secondaryStage.setTitle("My Classes");
      secondaryStage.show();  
}
 
  static void initializedDB() throws ClassNotFoundException, SQLException {
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    Connection connection = DriverManager.getConnection("jdbc:sqlserver://s16988308.onlinehome-server.com:1433;databaseName=CUNY_DB;integratedSecurity=false;", "cst3613", "password1");

    Statement statement = connection.createStatement();   
    String queryString = "select courseID, title, numOfCredits from dbo.Course where courseID in (select courseid from dbo.Enrollment where ssn=234567891);";
    ResultSet resultSet = statement.executeQuery("SELECT courseID, title, numOfCredits from dbo.Course where courseID in (select courseid from dbo.Enrollment where ssn=234567891);");
    txResult.setText("| Course Id |\t  " + "| Title |\t " + "| Credits |\t" + "\n");
    
    while (resultSet.next()) {
        txResult.appendText(resultSet.getString(1) + "   \t " + resultSet.getString(2) + "   \t " + resultSet.getString(3) + "\n");      
    }
}

}









