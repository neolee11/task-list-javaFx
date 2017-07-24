package application;


import com.google.common.base.Strings;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class uiController {

	@FXML
    public TextField textfield;

	@FXML
	public Button btnDown;
	
    public void initialize() {
        textfield.setText("This is set through controller");
        System.out.println("hello world");
        
        String a = "this is something";
        System.out.println(a + " - is empty? " + Strings.isNullOrEmpty(a));
        
        
        btnDown.addEventHandler(MouseEvent.MOUSE_CLICKED, (event) -> {
        	System.out.println("Button down clicked");
        	System.out.println("Handler: " + event.getEventType().getName());
        });
     
        btnDown.setOnAction(event -> {
        	System.out.println("Action fired on button Down");
        });
    }
}
