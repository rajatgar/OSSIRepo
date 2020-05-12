package ossi.com.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import org.testng.annotations.Test;

import ossi.com.qa.base.TestBase;
import ossi.com.qa.pages.AddReviewerPage;
import ossi.com.qa.pages.HomePage;
import ossi.com.qa.pages.LoginPage;
import ossi.com.qa.pages.StartSubmissionPage;
import ossi.com.qa.pages.viewBoardMemberPage;
import ossi.com.qa.pages.viewReviewerPage;

public class HomePageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	AddReviewerPage addreviewerPage;
	viewReviewerPage viewReviewerpage;
	viewBoardMemberPage viewboardmemberPage;
	StartSubmissionPage startsubmission;
	
	public HomePageTest() {
		super();
	}
	
	//test cases should be independent with each other
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage(); 
		addreviewerPage = new AddReviewerPage();
		viewReviewerpage = new viewReviewerPage();
		viewboardmemberPage = new viewBoardMemberPage();
		startsubmission=new StartSubmissionPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String HomePageTitle = homepage.validateHomePageTitle();
		Assert.assertEquals(HomePageTitle, "Inderscience Submissions - Inderscience Publishers","Home Page Title not matched");
	}
	
	@Test(priority=2)
	public void verifyUserNameTest() {
		Assert.assertTrue(homepage.verifyUserName());
	}
	
	@Test(priority=3)
	public void verifyAddReviewerLinkTest() {
		addreviewerPage = homepage.clickAddReviewer();
		
	}
	
	@Test(priority=4)
	public void verifyViewReviewerLinkTest() {
		viewReviewerpage = homepage.clickviewReviewerLink();
	}
	
	@Test(priority=5)
	public void verifyviewBoardMemberPageTest() {
		viewboardmemberPage = homepage.clickviewBoardMemberLink();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
