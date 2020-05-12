package ossi.com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ossi.com.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page factory - OR
	@FindBy(name = "txtUsername")
	WebElement Username;
	
	@FindBy(name = "txtPassword")
	WebElement password;
	
	@FindBy(name = "cmdSubmit")
	WebElement loginBtn;
	
	@FindBy(name = "Register")
	WebElement Register;
	
	@FindBy(xpath = "//img[contains(@title,'Inderscience Submissions - article submissions and peer-review system')]")
	WebElement ossiLogo;
	
	// initializing the page element
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	// Actions
	public String validateLoginTitle() {
		return driver.getTitle();
	}
	
	public boolean validateOSSIimage() {
		return ossiLogo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd ) {
		Username.sendKeys(un);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].setAttribute('style','border: 2px solid red;');",Username);
		
		password.sendKeys(pwd);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].setAttribute('style','border: 2px solid red;');",password);
		
		loginBtn.click();
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].setAttribute('style','border: 2px solid red;');",loginBtn);
		
		return new HomePage();    // This method is returning home page object
	}
}
