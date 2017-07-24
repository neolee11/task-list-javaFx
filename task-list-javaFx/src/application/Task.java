package application;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class Task {

	public static void main(String[] args){
		System.out.println("from task");
		
		SimpleIntegerProperty intProp = new SimpleIntegerProperty();
		intProp.addListener((ObservableValue<? extends Number> observable, Number oldVal, Number newVal) -> {
			System.out.println("Number is changed from " + oldVal + " to " + newVal);	
		});
		
		intProp.addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				// TODO Auto-generated method stub
				System.out.println("Number is changed from " + oldValue + " to " + newValue);	
				
			}
		});
		
		intProp.set(15);
		intProp.set(10);
		
	}
}
