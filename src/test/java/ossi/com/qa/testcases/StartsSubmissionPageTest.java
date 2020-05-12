package ossi.com.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ossi.com.qa.base.TestBase;
import ossi.com.qa.pages.HomePage;
import ossi.com.qa.pages.LoginPage;
import ossi.com.qa.pages.StartSubmissionPage;
import ossi.com.qa.util.MyScreenRecorder;

public class StartsSubmissionPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	StartSubmissionPage startsubmission;
	
	public StartsSubmissionPageTest() {
		super();
	}
	
	//test cases should be independent with each other
	
	@BeforeMethod
	public void setup() throws Exception {
		MyScreenRecorder.startRecording("setup");
		initialization();
		loginpage = new LoginPage(); 
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		startsubmission =homepage.submitArticle();
	}

	@Test
	public void startSubmissionArticle() throws Exception {
		startsubmission.startSubmissionStep1();
		Thread.sleep(3000);
		startsubmission.startSubmissionStep2();
		Thread.sleep(3000);
		startsubmission.startSubmissionStep3();
		Thread.sleep(3000);
		startsubmission.startSubmissionStep4();
		Thread.sleep(3000);
		startsubmission.startSubmissionStep5();
		Thread.sleep(3000);
		startsubmission.startSubmissionStep6();
		MyScreenRecorder.stopRecording();
	}
	
	
}
