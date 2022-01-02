package controller;


import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;




public class Scene1_controller{
	
	
	@FXML
	private Label myLabel;
	@FXML
	private DatePicker myDatePicker;
	
	
	public void getDate(ActionEvent event) {
		
		LocalDate myDate = myDatePicker.getValue();
		
		
		String myFormattedDate = myDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		
		myLabel.setText(myFormattedDate);
		//System.out.println(myFormattedDate);
		
	}
	
	

}
