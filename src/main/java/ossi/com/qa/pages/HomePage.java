package ossi.com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ossi.com.qa.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath="//a[contains(text(),'mlbmlb9')]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//b[contains(text(),'Add a Reviewer')]")
	WebElement addReviewerLink;
	
	@FindBy(xpath="//b[contains(text(),'View all reviewers')]")
	WebElement viewReviewerLink;
	
	@FindBy(xpath="//b[contains(text(),'View Editorial Board Members')]")
	WebElement viewBoardMemberLink;
	
	@FindBy(xpath="//b[contains(text(),'Submit a new article')]")
	WebElement submitNewArticle;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyUserName() {
		return userNameLabel.isDisplayed();
	}
	
	public AddReviewerPage clickAddReviewer() {
		addReviewerLink.click();
		return new AddReviewerPage();
	}
	
	public viewReviewerPage clickviewReviewerLink() {
		viewReviewerLink.click();
		return new viewReviewerPage();
	}
	
	public viewBoardMemberPage clickviewBoardMemberLink() {
		viewBoardMemberLink.click();
		return new viewBoardMemberPage();
	}
	
	public StartSubmissionPage submitArticle() {
		submitNewArticle.click();
		return new StartSubmissionPage();
	}
	
}
