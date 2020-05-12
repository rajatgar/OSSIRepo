package ossi.com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ossi.com.qa.base.TestBase;
import ossi.com.qa.pages.HomePage;
import ossi.com.qa.pages.LoginPage;
import ossi.com.qa.pages.viewReviewerPage;

public class viewReviewerPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	viewReviewerPage viewReviewPage;
	public viewReviewerPageTest() {
		super();
	}
	
	//test cases should be independent with each other
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage(); 
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		viewReviewPage =homepage.clickviewReviewerLink();
	}
	
	@Test(priority=1)
	public void testOfReviewerTitle() {
		String title=viewReviewPage.getTitleOfTheReviewersPage();
		System.out.println(title);
		Assert.assertEquals(title, "Welcome › View all reviewers");
		
	}
	@Test(priority=2)
	public void clickOnSearchWithoutSelectingNameAndUserType() {
		viewReviewPage.clickOnSearch();
	}
	@Test(priority=3)
	public void searchReViewerAndUserTypeIsAuthor() {
		viewReviewPage.sendReviewerName();
		viewReviewPage.clickOndropdownUserTypeAsAuthor();
		viewReviewPage.clickOnSearch();
		
		
	}
	@Test(priority=4)
	public void searchReViewerAndUserTypeIsEditor() {
		viewReviewPage.sendReviewerName();
		viewReviewPage.clickOndropdownUserTypeAsEditor();
		viewReviewPage.clickOnSearch();
	}
	@Test(priority=5)
	public void searchReViewerAndUserTypeIsReviewer() 
	{
		viewReviewPage.sendReviewerName();
		viewReviewPage.clickOndropdownUserTypeAsReviewer();
		viewReviewPage.clickOnSearch();

	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}