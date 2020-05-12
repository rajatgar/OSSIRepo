package ossi.com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import ossi.com.qa.base.TestBase;

public class AddReviewerPage extends TestBase{
	
	@FindBy(xpath="//b[contains(text(),'Add a Reviewer')]")
	@CacheLookup
	WebElement AddReviewerLabel;
	
	@FindBy(name="txtEmail")
	WebElement EmailAddress;
	
	@FindBy(name="selTitle")
	WebElement dropdownTitleType;
	
	@FindBy(name="txtFirstName")
	WebElement FirstName;
	
	@FindBy(name="txtLastName")
	WebElement LastName;
	
	@FindBy(name="txtAlternateEmail")
	WebElement AlternateEmailAddress;
	
	@FindBy(name="selCountry")
	WebElement dropdownCountry;
	
	@FindBy(name="txtInstitution")
	WebElement Institution;
	
	@FindBy(xpath="//input[@type='checkbox' and @id='selJournal'][1]")
	WebElement checkboxJournal;
	
	@FindBy(name="cmdSubmit")
	WebElement btnAddReviewer;
	
	public AddReviewerPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateAddReviewerLabel() {
		return AddReviewerLabel.isDisplayed();
	}
	
	public void enterEmail() {
		EmailAddress.sendKeys("rajat.garg@idsil.com");
	}
	
	public void validateClickTitle() {
		dropdownTitleType.click();
		Select title = new Select(dropdownTitleType);
		title.selectByVisibleText("Dr.");
	}
	
	public void validateFirstName() {
		FirstName.sendKeys("Rajat");
	}
	
	public void validateLastName() {
		LastName.sendKeys("Garg");
	}
	
	public void validateAlternateEmailAddress() {
		AlternateEmailAddress.sendKeys("rajat.mzn86@gmail.com");
	}
	
	public void validateCountry() {
		dropdownCountry.click();
		Select country = new Select(dropdownCountry);
		country.selectByValue("3");
	}
	
	public void validateCheckboxJournal() {
		checkboxJournal.click();
	}
	
	public void validateAddReviewerButton() {
		btnAddReviewer.click();
	}
	
	
	public void validateInstitution() {
		Institution.sendKeys("MIT");
	}
}
