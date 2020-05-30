/**
 * Name: Arjina Khanom
 * CST 3613
 * Final Project
 * Assignment - 15
 * Due Date: Tuesday, May 19, 2020 At 6:00 PM
 **/

package ArjinaSfinalProject;

import java.awt.Insets;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {
	public static void display(String title, String message) {
		Stage window = new Stage();
		
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(250);
		
		Label alertmessage = new Label("Are you sure? Yes / no");
	
		//create two buttons and set actions for them
		Button closeButton = new Button ("No");
		closeButton.setOnAction(e -> window.close());
		
		Button btYes = new Button ("Yes");
		btYes.setOnAction(e -> confirmationBox.display("Register", "What class do you want to add"));	
		
		VBox layout = new VBox(15);
		HBox horizontalline = new HBox(12);
		horizontalline.setAlignment(Pos.CENTER);
		horizontalline.getChildren().addAll(btYes, closeButton);
		layout.getChildren().addAll(alertmessage, horizontalline);
		Scene scene = new Scene(layout);
		layout.setAlignment(Pos.CENTER);
		
		window.setScene(scene);
		window.setTitle("Alert");
		window.showAndWait();
	}

}
