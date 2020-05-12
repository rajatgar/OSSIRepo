package ossi.com.qa.testcases;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ossi.com.qa.base.TestBase;
import ossi.com.qa.pages.AddReviewerPage;
import ossi.com.qa.pages.HomePage;
import ossi.com.qa.pages.LoginPage;
import ossi.com.qa.util.TestUtil;


public class AddReviewerPageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	AddReviewerPage addreviewerPage;
	String sheetname = "Reviewer";
	
	public AddReviewerPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage(); 
		addreviewerPage = new AddReviewerPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		addreviewerPage = homepage.clickAddReviewer();
	}
	
	@Test(priority=1)
	public void verifyAddReviewerLabelTest() {
		Assert.assertTrue(addreviewerPage.validateAddReviewerLabel());
	}
	
	@DataProvider
	public Object[][] getOSSITestData() throws EncryptedDocumentException, InvalidFormatException {
		
		Object data[][]=TestUtil.getTestData(sheetname);
		return data;
	}
	
	@Test(priority=2,dataProvider="getOSSITestData")
	public void verifyAddReviewerData(String Title, String FirstName,String LastName,String Email,String Country,String Institution) {
		addreviewerPage.enterEmail();
		addreviewerPage.validateClickTitle();
		addreviewerPage.validateFirstName();
		addreviewerPage.validateLastName();
		addreviewerPage.validateAlternateEmailAddress();
		addreviewerPage.validateCountry();
		addreviewerPage.validateInstitution();
		addreviewerPage.validateCheckboxJournal();
		addreviewerPage.validateAddReviewerButton();

	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
