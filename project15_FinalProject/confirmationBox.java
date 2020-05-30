
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

public class confirmationBox {
	public static void display(String title, String message) {
		Stage window = new Stage();
		
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(250);
		
		Label lblmessage = new Label("Your class has been removed successfully.");
	
		//create two buttons and set actions for them
		Button closeButton = new Button ("Close");
		closeButton.setOnAction(e -> window.close());
		
		
		VBox layout = new VBox(15);

		layout.getChildren().addAll(lblmessage, closeButton);
		Scene scene = new Scene(layout);
		layout.setAlignment(Pos.CENTER);
		
		window.setScene(scene);
		window.setTitle("Confirmation");
		window.showAndWait();
	}

}
