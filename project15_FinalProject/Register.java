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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Register {
 //	 Stage window;
	
		public static void display(String title, String message) {
		Scene scene1, scene2;
		Stage window = new Stage();
			 
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(250);
		Label label = new Label("Add your class");
		//label.setText(message);
		
		//create two buttons		
		Button cancelBtn = new Button ("Cancel");
		Button addBtn = new Button ("Add");
		// need actions for the add button in Register page
		cancelBtn.setOnAction(e -> window.close());
	
		
		// to create the Choice box (drop down menu)
		Button itemBtn = new Button ("Classes");
		
		 ChoiceBox<String> choiceBox = new ChoiceBox<>();
		 // get items returns the ObservableList object which you can add items to 
		
	      choiceBox.getItems().add("ARF12");
	      choiceBox.getItems().add("CST00");
	      choiceBox.getItems().add("CST01");
	      choiceBox.getItems().add("CST02");
	      choiceBox.getItems().add("CST03");
	      choiceBox.getItems().add("CST04");
	      choiceBox.getItems().add("CST07");
	      choiceBox.getItems().add("CST08");
	      choiceBox.getItems().add("CST0A");
	      choiceBox.getItems().add("CST10");
	      choiceBox.getItems().add("CST13");
	      choiceBox.getItems().add("CST14");
	      choiceBox.getItems().add("CST19");
	      choiceBox.getItems().add("CST42");
	      choiceBox.getItems().add("CST47");
	      choiceBox.getItems().add("CST48");
	      choiceBox.getItems().add("CST71");
	      choiceBox.getItems().add("cst55");
	      choiceBox.getItems().add("ENG01");
	      
	      //set a default value
	      choiceBox.setValue("Course");
	      
	      itemBtn.setOnAction(e -> getChoice(choiceBox));
	      	
		
		VBox layout = new VBox(20);
		//layout.setPadding(new Insets(20, 20, 20, 20));
		layout.getChildren().addAll(label,choiceBox, addBtn, cancelBtn);
		layout.setAlignment(Pos.CENTER);
		scene1 = new Scene(layout, 300, 300);
		
		
		window.setScene(scene1);
		window.setTitle("Register");
		window.show();
			
		
	}
		  // to get value of the selected item
	      private static void getChoice(ChoiceBox<String> choiceBox) {
	    	  String course = choiceBox.getValue();
	    	  System.out.println(course);	
	}	

}
