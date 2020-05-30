
/**
 * Name: Arjina Khanom
 * CST 3613
 * Final Project
 * Assignment - 15
 * Due Date: Tuesday, May 19, 2020 At 6:00 PM 
 * Question:1. You must use JavaFX for all UI controls.
 * 2. All database related methods should in DBUtility.java file only.
 * 3. No compilation error in your codes.
 * 4. Use the same database used in class.
 * 5. File name must be same as what we discussed and below picture. main() should be in Login.java.
 **/
/* Work sites: 
 * 1. Solution of the Project 14 posted in blackboard, CST3613
 * 2. Sample code posted in blackboard, CST3613
 * 3. http://tutorials.jenkov.com/javafx/textarea.html
 * 4. https://www.youtube.com/watch?v=HFAsMWkiLvg&list=PL6gx4Cwl9DGBzfXLWLSYVy8EbTdpGbUIG&index=6
 * 5. https://www.youtube.com/watch?v=AP4e6Lxncp4&list=PL6gx4Cwl9DGBzfXLWLSYVy8EbTdpGbUIG&index=22
 */

package ArjinaSfinalProject;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Login extends Application {

    static TextField social = new TextField();
    final Label lblMessage = new Label();
    final Label lbl = new Label();
    
 public void start(Stage primaryStage) throws Exception {
    	 VBox Pane = new VBox(25);
         Pane.setAlignment(Pos.CENTER);
         
    	lblMessage.setText("Please log in with our SSN #");
    	lbl.setText("SSN:");
        ArrayList ssn = new ArrayList();
        Label eror = new Label("Error...Invalid SSN, please try again.");
      
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection connection = DriverManager.getConnection("jdbc:sqlserver://s16988308.onlinehome-server.com:1433;databaseName=CUNY_DB;integratedSecurity=false;", "cst3613", "password1");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select ssn from Students;");

        while (resultSet.next()) {
            ssn.add(resultSet.getString(1));
        }
     
        Button btExit = new Button("Exit");
        btExit.setOnAction((ActionEvent e) -> {
            Platform.exit();

        });

        Button btLogin = new Button("Login");
        HBox hbox1 = new HBox(50);
        hbox1.getChildren().addAll(btExit, btLogin);
        hbox1.setAlignment(Pos.CENTER);
        
        btLogin.setOnAction((ActionEvent e) -> {
            boolean valid = ssn.contains(social.getText());
            if (valid) {
                try {
                    MyClasses secondaryStage = new MyClasses();
                    secondaryStage.start(primaryStage);
                } catch (Exception ex) {
                    Logger.getLogger(MyClasses.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            eror.setVisible(true);
        });
        eror.setVisible(false);
        HBox hbox2 = new HBox(20);
        hbox2.getChildren().addAll(lbl, social);
        hbox2.setAlignment(Pos.CENTER_LEFT);
        
        Pane.getChildren().addAll(eror, lblMessage, hbox2, hbox1);
        BorderPane borderPane = new BorderPane(Pane);

        primaryStage.setScene(new Scene(borderPane, borderPane.getPrefWidth(), borderPane.getPrefWidth()));
        HBox operatorsPane = new HBox(10);
        BorderPane.setMargin(operatorsPane, new Insets(40, 40, 40, 40));
        BorderPane.setMargin(Pane, new Insets(100, 150, 150, 150));
        primaryStage.setTitle("Login Page");
        primaryStage.setMinWidth(350);
        primaryStage.setMinHeight(250);
        primaryStage.show();

    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
    	
    	DBUtility.connectToDB();
        Application.launch(args);
           
}

}


 



