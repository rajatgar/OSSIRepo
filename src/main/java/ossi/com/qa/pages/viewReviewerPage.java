package ossi.com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import ossi.com.qa.base.TestBase;

public class viewReviewerPage extends TestBase {
	
@FindBy(id="breadcrumbtrail")
WebElement welcomeTitle;

@FindBy(id="txtKeyword")
WebElement reviewerName;

@FindBy(id="selUserType")
WebElement dropdownUserType;

@FindBy(xpath="//input[@name='search']")
WebElement searchBtn;

public viewReviewerPage() {
	
	PageFactory.initElements(driver, this);
	
}

public String getTitleOfTheReviewersPage() {
return welcomeTitle.getText();
}

public void sendReviewerName() {
reviewerName.sendKeys("Rajat");
}

public String userTypeDropdown() {
return dropdownUserType.getText();
}

public void clickOndropdownUserTypeAsAuthor() {
dropdownUserType.click();

Select uType= new Select(dropdownUserType);
uType.selectByVisibleText("Author");
}

public void clickOndropdownUserTypeAsReviewer() {
dropdownUserType.click();

Select uType= new Select(dropdownUserType);
uType.selectByVisibleText("Reviewer");
}
public void clickOndropdownUserTypeAsEditor() {
dropdownUserType.click();

Select uType= new Select(dropdownUserType);
uType.selectByVisibleText("Editor");
}
public void clickOnSearch() {
searchBtn.click();
}
}
