package ossi.com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ossi.com.qa.base.TestBase;
import ossi.com.qa.pages.HomePage;
import ossi.com.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage(); 
	}
	
	@Test(priority = 1)
	public void loginpageTitleTest() {
		String title = loginpage.validateLoginTitle();
		Assert.assertEquals(title, "Inderscience Submissions - article submissions and peer-review system","Login Page Title not matched");
	}
	
	@Test(priority = 2)
	public void ossiLogoImageTest() {
		boolean flag = loginpage.validateOSSIimage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 3)
	public void LoginTest() {
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
