package homeassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDemo {
	public static ChromeDriver driver;
	public static JavascriptExecutor js;
	public static String Url;

	enum ElementType{
		RADIO,
		BUTTON,
		CHKBOX
	}
	public static void main(String[] args) {
		ElementType myElemt = ElementType.BUTTON;

		switch(myElemt) {
		case RADIO:
			Url="https://www.leafground.com/radio.xhtml";
            break;
            
		case BUTTON:
			Url="https://www.leafground.com/button.xhtml";
			break;
			
		case CHKBOX:
			Url="https://www.leafground.com/checkbox.xhtml";
			break;
			
		}

		preCondition(Url);
		elements(myElemt);
		postCondition();
	}

	private static void preCondition(String url) {
		//Initialize ChromeDriver
		driver=new ChromeDriver();

		//Load the URL 
		driver.get(url);

		//Maximize the browser window
		driver.manage().window().maximize();

		//All elements loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		js = (JavascriptExecutor) driver;
	}

	private static void postCondition() {
		//Enter the username and password
		//driver.close();
	}

	/**
	 * Create Account
	 * @param myElemt 
	 * @throws InterruptedException 
	 */
	private static void elements(ElementType myElemt) {
		if(myElemt == myElemt.RADIO) {
			//Select 'Your most favourite browser' from the radio buttons
			WebElement txtRadioFavBrwrElement = driver.findElement(By.xpath("(//h5[text()='Your most favorite browser']//following::div//label[text()='Firefox'])[1]"));

			//Click on a radio button, then click on the same radio button again to verify that it becomes ‘unselected’.
			try {
				Thread.sleep(5000);
				if(!txtRadioFavBrwrElement.getAttribute("class").contentEquals("ui-state-active"))
					txtRadioFavBrwrElement.click();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			//System.out.println(txtRadioFavBrwrElement.isSelected()? "selected": "not selected");

			try {
				Thread.sleep(5000);
				txtRadioFavBrwrElement.click();
				//ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active
				//js.executeScript(((Object) txtRadioFavBrwrElement).seetAttribute("class", "ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active"));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(txtRadioFavBrwrElement.isEnabled()? "enabled": "disabled");
			//System.out.println(txtRadioFavBrwrElement.isSelected()? "selected": "not selected");

			//Check and select the age group (21-40 Years) if not already selected.
			WebElement txtRadioAgeGrpElement = driver.findElement(By.xpath("(//h5[contains(text() ,'age group')]//following::div//label[text()='21-40 Years'])[1]"));
			if(!txtRadioAgeGrpElement.isEnabled()) {
				txtRadioAgeGrpElement.click();
			}
		}
		if(myElemt == myElemt.BUTTON) {
			//Click on the button with the text ‘Click and Confirm title.’
			WebElement txtCCTitleBtnElement = driver.findElement(By.xpath("(//h5[contains(text(),'Confirm title')]//following::button)[1]"));

			//Verify that the title of the page is ‘dashboard.’
			System.out.println(driver.getTitle().contentEquals("Dashboard")?"Redirected to Dashboard page":"Not redirected to Dashboard page");
			
			//driver.navigate().back();
			//Check if the button with the text ‘Confirm if the button is disabled’ is disabled.
			WebElement txtIsBtnDsabledElement = driver.findElement(By.xpath("(//h5[contains(text(),'button is disabled')]//following::button)[1]"));
			System.out.println(!txtIsBtnDsabledElement.isEnabled() ? "Disabled":"enabled");
			
			//Find and print the position of the button with the text ‘Submit.’
			WebElement txtSubmitPositionElement = driver.findElement(By.xpath("(//h5[contains(text(),'position')]//following::button)[1]"));
			Point location = txtSubmitPositionElement.getLocation();
			System.out.println(String.format("x and y are %d, %d", location.x, location.y));
			
			//Find and print the background color of the button with the text ‘Find the Save button color.’
			WebElement txtSaveBtnElement = driver.findElement(By.xpath("(//h5[contains(text(),'Save button')]//following::button)[1]"));
			System.out.println(txtSaveBtnElement.getCssValue("background-color"));
			
			//Find and print the height and width of the button with the text ‘Find the height and width of this button.’
			WebElement txtHtWdthBtnElement = driver.findElement(By.xpath("(//h5[contains(text(),'height and width')]//following::button)[1]"));
			Dimension size = txtHtWdthBtnElement.getSize();
			System.out.println(String.format("width and ht are %d %d", size.width, size.height));
		}
		if(myElemt == myElemt.CHKBOX) {
			//Click on the "Basic Checkbox.”
			
			//Click on the "Notification Checkbox."
			//Verify that the expected message is displayed.
			//Click on your favorite language (assuming it's related to checkboxes).
			//Click on the "Tri-State Checkbox."
			//Verify which tri-state option has been chosen.
			//Click on the "Toggle Switch."
			//Verify that the expected message is displayed.
			//Verify if the Checkbox is disabled.
			//Select multiple options on the page (details may be needed).
			//Perform any additional actions or verifications required.
			
		}
	}
}

