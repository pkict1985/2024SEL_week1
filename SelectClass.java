package homeassignment;

import java.time.Duration;
import java.util.Random;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectClass {
	public static ChromeDriver driver;
	
	public static void main(String[] args) {
		System.out.println("Facebook registration process ");
		
		preCondition();
		fbReg();
		postCondition();
	}

	private static void preCondition() {
		//Initialize ChromeDriver
		driver=new ChromeDriver();
		
		//Load the URL 
		driver.get("https://en-gb.facebook.com/");
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Add an implicit wait to ensure the web page elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	}
	
	private static void postCondition() {
		//Enter the username and password
		driver.close();
	}

	/**
	 * FB Reg
	 */
	private static void fbReg() {
		  //Click on the Create new account button.
	    driver.findElement(By.linkText("Create new account")).click();
	
	    //Enter the Mobile number or email address.
	    WebElement txtMobileOrEmailElement = driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input"));
	    txtMobileOrEmailElement.sendKeys("5756375637", Keys.ENTER);
	    
	    //Handle all three dropdowns in Date of birth
	    WebElement daySelectElement = driver.findElement(By.id("day"));
	    Select ddlDay=new Select(daySelectElement);
	    ddlDay.selectByValue("7");
	    
	    WebElement monthSelectElement = driver.findElement(By.id("month"));
	    Select ddlMonth=new Select(monthSelectElement);
	    ddlMonth.selectByValue("7");
	    
	    WebElement yearSelectElement = driver.findElement(By.id("year"));
	    Select ddlYear=new Select(yearSelectElement);
	    ddlYear.selectByValue("1971");
	    
	    //Enter the First name.
	    WebElement txtFirstNameElement = driver.findElement(By.name("firstname"));
	    txtFirstNameElement.sendKeys("DsmFB", Keys.ENTER);
	    
	    //Enter the Surname.
	    WebElement txtSurnameElement = driver.findElement(By.name("lastname"));
	    txtSurnameElement.sendKeys("ln", Keys.ENTER);

	    //Select the radio button in Gender.
	    WebElement radioGenderElement = driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input"));
	    radioGenderElement.click();
	    
	  
	    
	    //Enter the New password.
	    WebElement txtNewPwd = driver.findElement(By.xpath("//div[text()='New password']/following-sibling::input"));
	    txtNewPwd.sendKeys("AD123hjj!!", Keys.ENTER);
	    
	}
}

