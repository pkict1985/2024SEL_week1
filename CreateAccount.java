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

public class CreateAccount {
	public static ChromeDriver driver;
	
	public static void main(String[] args) {
		System.out.println("Account Module - Create Functionality");
		
		preCondition();
		createAccount();
		postCondition();
	}

	private static void preCondition() {
		//Initialize ChromeDriver
		driver=new ChromeDriver();
		
		//Load the URL 
		driver.get("http://leaftaps.com/opentaps/");
		
		//Maximize the browser window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	}
	
	private static void postCondition() {
		//Enter the username and password
		driver.close();
	}

	/**
	 * Create Account
	 */
	private static void createAccount() {

    //Enter a username
    WebElement txtUsernameElement = driver.findElement(By.id("username"));
    txtUsernameElement.sendKeys("DemoSalesManager");
    
	//Enter a password
    WebElement txtPasswordElement = driver.findElement(By.id("password"));
    txtPasswordElement.sendKeys("crmsfa");
    
	//Click the "Login" button
    WebElement btnLoginElement = driver.findElement(By.className("decorativeSubmit"));
    btnLoginElement.click();
    
    //Verify Welcome page
    System.out.println(driver.findElement(By.tagName("h2")).getText().contains("Welcome")? "Redirected to Welcome Page": "Failed to redirect to Welcome Page");
    
    //Click on the "CRM/SFA" link
    driver.findElement(By.partialLinkText("CRM/SFA")).click();
    
    //Verify the "My Home" page
    System.out.println(driver.getTitle().contains("My Home")? "Redirected to My Home Page":"Failed to redirect to the My Home Page");
    
    //Click on the "Create Account" button
    WebElement linkCreateAccountElement = driver.findElement(By.linkText("Create Account"));
    linkCreateAccountElement.click();
    
    //Verify "Create Account" page 
    System.out.println(driver.getTitle().contains("Create Account")? "Redirected to \"Create Account\" Page":"Failed to redirect to the \"Create Account\"");
    
    //Enter an account name
    WebElement txtAccountnameElement = driver.findElement(By.id("accountName"));
    txtAccountnameElement.clear();
    //String accountId="pv accounts"+ Integer.toString((new Random().nextInt(10))+1);
    txtAccountnameElement.sendKeys(generateAccountName(), Keys.ENTER);
    
    //Enter a description as "Selenium Automation Tester."
    
    
    final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    wait.until(ExpectedConditions.refreshed(
        ExpectedConditions.elementToBeClickable( driver.findElement(By.name("description")))));
    driver.findElement(By.name("description")).click();
    //WebElement txtAreaDescriptionElement = driver.findElement(By.name("description"));
    driver.executeScript("arguments[0].setAttribute('value', arguments[1])", driver.findElement(By.name("description")), "Selenium Automation Tester");
    
    //Select "ComputerSoftware as the Industry"
    WebElement industrySelectElement = driver.findElement(By.name("industryEnumId"));
    Select ddlIndustry=new Select(industrySelectElement);
    ddlIndustry.selectByIndex(3);
    
    //Select "S-Corporation" as ownership using SelectByVisibleText.
    WebElement ownershipSelectElement = driver.findElement(By.name("ownershipEnumId"));
    Select ddlOwnership=new Select(ownershipSelectElement);
    ddlOwnership.selectByVisibleText("S-Corporation");
    
    //Select "Employee" as the source using SelectByValue.
    WebElement sourceSelectElement = driver.findElement(By.id("dataSourceId"));
    Select ddlSource=new Select(sourceSelectElement);
    ddlSource.selectByValue("LEAD_EMPLOYEE");
    
    //Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
    WebElement marketCampaignSelectElement = driver.findElement(By.id("marketingCampaignId"));
    Select ddlMC=new Select(marketCampaignSelectElement);
    ddlMC.selectByIndex(6);
    
    //Select "Texas" as the state/province using SelectByValue.
    WebElement stateProvinceSelectElement = driver.findElement(By.id("generalStateProvinceGeoId"));
    Select ddlStateProvince=new Select(stateProvinceSelectElement);
    ddlStateProvince.selectByValue("TX");
    
    //Click the "Create Account" button.
    WebElement btnCreateAccountElement = driver.findElement(By.className("smallSubmit"));
    btnCreateAccountElement.click();
    
    //Verify that the account name is displayed correctly.
    WebElement labelAccountName = driver.findElement(By.xpath("(//table[@class='fourColumnForm']//span[text()='Account Name']/following::td)[1]"));
    System.out.println(labelAccountName.getText().contains(txtAccountnameElement.getText())?"Created Account Name is correct":"Created Account Name is wrong");
	}
	
	public static String generateAccountName() {
        String uuid = UUID.randomUUID().toString();
        return "pv acct "+uuid;
    }
}

