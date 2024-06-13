package homeassignment;

import org.checkerframework.checker.units.qual.radians;

public class Elements extends Button{
	/*
	 *  Inheritance.
	 */

	public static void main(String[] args) {
		System.out.println("Execution starts");
		Button objBtn=new Button();
		objBtn.click();
		objBtn.setText("Button Class");
		objBtn.submit();
		
		RadioButton objRadio=new RadioButton();
		objRadio.click();
		objRadio.submit();
		objRadio.setText("Radio Button Class");
		objRadio.selectRadioButton();
		
		CustomButton objCustom=new CustomButton();
		objCustom.click();
		objCustom.setText("Custom Butto Class");
		objCustom.draw();
		
		CheckBoxButton objCheck=new CheckBoxButton();
		objCheck.click();
		objCheck.setText("Check Box class");
		objCheck.submit();
		objCheck.clickCheckButton();
		
		TextField objtxtField=new TextField();
		objtxtField.click();
		objtxtField.setText("TextField Class");
		objtxtField.getText();
		
	}
	
}

