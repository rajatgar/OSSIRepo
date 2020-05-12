package ossi.com.qa.pages;

import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import ossi.com.qa.base.TestBase;

public class StartSubmissionPage extends TestBase{
	@FindBy(id = "chkCheckList1")
	WebElement NotesToTheEditorChecklist;
	@FindBy(id = "chkCheckList7")
	WebElement journalforconsiderationCheckList;
	@FindBy(id = "chkCheckList8")
	WebElement submissionsinderscienceComChecklist;
	@FindBy(id = "chkCheckList9")
	WebElement AuthorGuidelinesPreparingArcticlesChecklist;
	
	@FindBy(id = "chkCheckList10")
	WebElement circumstancesNotesToEditor ;

	@FindBy(id = "chkCheckList2")
	WebElement authorGuidelinePage ;
	@FindBy(id = "chkCheckList3")
	WebElement MicrosoftWordformatChecklist;
	@FindBy(id = "chkCheckList6")
	WebElement IMPORTANTChecklist ;
	@FindBy(id = "selJournal")
	WebElement dropdownBtnTitleSelected ;
	
	@FindBy(name = "cmdSubmit")
	WebElement saveAndcontinue ;
	@FindBy(xpath = "//input[@value='Save & Continue']")
	WebElement saveAndcontinueStep2 ;
	//Step-3
	@FindBy(id = "txtMetaTitle")
	WebElement submissionTitleText ;
	@FindBy(id = "txtMetaAbstract")
	WebElement submissionabstractText ;
	@FindBy(id = "txtMetaKeywords")
	WebElement KeywordsText ;
	@FindBy(xpath = "//input[@value='Save & Continue']")
	WebElement saveAndcontinueStep3 ;
	// step=4
	@FindBy(xpath="//input[@id='articlefile']")
	WebElement chooseAfile ;
	@FindBy(xpath = "//input[@value='Upload your article']")
	WebElement  UploadAFile;
	@FindBy(xpath = "//input[@value='Save & Continue']")
	WebElement  saveAndContinueStep1;
	
	//Step=5 Expert 1
	@FindBy(id = "txtEmail")
	WebElement expert1Email ;
	@FindBy(id = "selTitle")
	WebElement expert1TitleDropdown ;
	
	@FindBy(id = "txtFirstName")
	WebElement expert1FirstnameText ;
	@FindBy(id = "txtLastName")
	WebElement expert1LasttnameText ;
	@FindBy(id = "selCountry")
	WebElement expert1CountrynameDropdown ;
	@FindBy(id = "txtBiography")
	WebElement ShortbiographyText ;
	@FindBy(id = "txtInstitution")
	WebElement institutionText ;
	@FindBy(xpath = "//input[@value='Save this expert & continue']")
	WebElement  saveAndContinueStep5;
	
	// Step=5 Expert 2
	@FindBy(id = "txtEmail")
	WebElement expert1Email2 ;
	@FindBy(id = "selTitle")
	WebElement expert1TitleDropdown2 ;
	@FindBy(id = "txtFirstName")
	WebElement expert1FirstnameText2 ;
	@FindBy(id = "txtLastName")
	WebElement expert1LasttnameText2 ;
	@FindBy(id = "selCountry")
	WebElement expert1CountrynameDropdown2 ;
	@FindBy(id = "txtBiography")
	WebElement ShortbiographyText2 ;
	@FindBy(id = "txtInstitution")
	WebElement institutionText2 ;
	@FindBy(xpath = "//input[@value='Save this expert & continue']")
	WebElement  saveAndContinueStep2;
	
	
	// Step=5 Expert 3
		@FindBy(id = "txtEmail")
		WebElement expert1Email3 ;
		@FindBy(id = "selTitle")
		WebElement expert1TitleDropdown3 ;
		@FindBy(id = "txtFirstName")
		WebElement expert1FirstnameText3 ;
		@FindBy(id = "txtLastName")
		WebElement expert1LasttnameText3 ;
		@FindBy(id = "selCountry")
		WebElement expert1CountrynameDropdown3;
		@FindBy(id = "txtBiography")
		WebElement ShortbiographyText3;
		@FindBy(id = "txtInstitution")
		WebElement institutionText3;
		@FindBy(xpath = "//input[@value='Save this expert & continue']")
		WebElement  saveAndContinueStep3;
		
		
		// Step=5 Expert 4
				@FindBy(id = "txtEmail")
				WebElement expert1Email4;
				@FindBy(id = "selTitle")
				WebElement expert1TitleDropdown4;
				@FindBy(id = "txtFirstName")
				WebElement expert1FirstnameText4;
				@FindBy(id = "txtLastName")
				WebElement expert1LasttnameText4;
				@FindBy(id = "selCountry")
				WebElement expert1CountrynameDropdown4;
				@FindBy(id = "txtBiography")
				WebElement ShortbiographyText4;
				@FindBy(id = "txtInstitution")
				WebElement institutionText4;
				@FindBy(xpath = "//input[@value='Save this expert & continue']")
				WebElement  saveAndContinueStep4;
				
	// Step 5 Completion
				@FindBy(id="cmdSubmitbtn")
				WebElement SubmitStep5;
				
	// Step 6 Completion
				@FindBy(name ="cmdSubmit")
				WebElement SubmitStep6;
	
	
	public StartSubmissionPage() {
	PageFactory.initElements(driver, this);
		
	}
	public void startSubmissionStep1() throws InterruptedException {
		NotesToTheEditorChecklist.click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].setAttribute('style','border: 2px solid red;');",NotesToTheEditorChecklist );
	
		
		journalforconsiderationCheckList.click();
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].setAttribute('style','border: 2px solid red;');",journalforconsiderationCheckList );
		
		submissionsinderscienceComChecklist.click();
		AuthorGuidelinesPreparingArcticlesChecklist.click();
		circumstancesNotesToEditor.click();
		authorGuidelinePage.click();
		MicrosoftWordformatChecklist.click();
		IMPORTANTChecklist.click();
		dropdownBtnTitleSelected.click();
		Select uType= new Select(dropdownBtnTitleSelected);
		uType.selectByVisibleText("IDS test -2012 : IDS");
		Thread.sleep(3000);
		
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].setAttribute('style','border: 2px solid red;');",saveAndcontinue );
		saveAndcontinue.click();
	}
	public void startSubmissionStep2() throws InterruptedException {
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("arguments[0].setAttribute('style','border: 2px solid red;');",saveAndcontinueStep2 );
		saveAndcontinueStep2.click();
		Thread.sleep(3000);
	}
	public void startSubmissionStep3() throws InterruptedException {
		Random objGenerator = new Random();
		int randomNumber = objGenerator.nextInt(1000);
		submissionTitleText.sendKeys("selenese1 program1 interface" + randomNumber);
		submissionabstractText.sendKeys("Through a simple setup, WebDriver can be used with all major browsers. Automate real user interactions in Firefox, Safari, Edge, Chrome, Internet Explorer and more!\r\n" + 
				"\r\n" + 
				"Selenium WebDriver refers to both the language bindings and the implementations of the individual browser controlling code. This is commonly referred to as just WebDriver.\r\n" + 
				"\r\n" + 
				"WebDriver is a W3C Recommendation!\r\n" + 
				"The W3C is an international community that works to develop Web standards. In June 2018, WebDriver became a W3C recommendation.\r\n" + 
				"\r\n" + 
				"What does this mean? Major browser vendors (Mozilla, Google, Apple, Microsoft) support WebDriver and work constantly to improve the browsers\r\n" + 
				"and browser controlling code, which leads to a more uniform behaviour across the different browsers, making your automation scripts more stable.\r\n" + 
				"\r\n" + 
				"Learn More");
		KeywordsText.sendKeys("Selenium WebDriver drives a browser natively, as a real user would, either locally or on remote machines");
		saveAndcontinueStep3.click();
		Thread.sleep(3000);
	}
	public void startSubmissionStep4() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseAfile));
		chooseAfile.sendKeys("D:\\Jenny Craig Document\\April 2020 Canada Menu PDFs\\April2020_Menu_Classic_CAN_1500_Wk1-4_FA (1).pdf");
		UploadAFile.click();
		Thread.sleep(3000);
		saveAndContinueStep1.click();
		
	}
	public void startSubmissionStep5() throws InterruptedException {
		
		// For Expert 1
		expert1Email.sendKeys("rajat.g123@mailinator.com");
		expert1Email.sendKeys(Keys.TAB);

		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
	//	driver.switchTo().alert().accept();
	//	Thread.sleep(3000);
		expert1TitleDropdown.click();
		//driver.switchTo().alert().accept();
		Select uType= new Select(expert1TitleDropdown);
		uType.selectByVisibleText("Prof.");
		Thread.sleep(3000);
		expert1FirstnameText.sendKeys("abhi");
		expert1LasttnameText.sendKeys("anand");
		expert1CountrynameDropdown.click();
		Select countryType= new Select(expert1CountrynameDropdown);
		countryType.selectByVisibleText("ALGERIA");
		Thread.sleep(3000);
		ShortbiographyText.sendKeys("Test");
		institutionText.sendKeys("oxford");
		Thread.sleep(5000);
		saveAndContinueStep5.click();
		
		// For Expert 2
		
		expert1Email2.sendKeys("rajat.g1234@mailinator.com");
		expert1Email2.sendKeys(Keys.TAB);

		WebDriverWait wait2 = new WebDriverWait(driver,60);
		wait2.until(ExpectedConditions.alertIsPresent());
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert2.accept();
		
		expert1TitleDropdown2.click();
	
		Select uType2= new Select(expert1TitleDropdown2);
		uType2.selectByVisibleText("Prof.");
		Thread.sleep(3000);
		expert1FirstnameText2.sendKeys("abhi");
		expert1LasttnameText2.sendKeys("anand");
		expert1CountrynameDropdown2.click();
		Select countryType2= new Select(expert1CountrynameDropdown);
		countryType.selectByVisibleText("ALGERIA");
		Thread.sleep(3000);
		ShortbiographyText2.sendKeys("Test");
		institutionText2.sendKeys("oxford");
		Thread.sleep(5000);
		saveAndContinueStep2.click();
		
		// For Expert 3
				Thread.sleep(2000);
				expert1Email3.sendKeys("rajat.g12345@mailinator.com");
				expert1Email3.sendKeys(Keys.TAB);

				WebDriverWait wait3 = new WebDriverWait(driver,60);
				wait3.until(ExpectedConditions.alertIsPresent());
				Alert alert3 = driver.switchTo().alert();
				System.out.println(alert.getText());
				alert3.accept();
				
				expert1TitleDropdown3.click();
			
				Select uType3= new Select(expert1TitleDropdown3);
				uType3.selectByVisibleText("Prof.");
				Thread.sleep(3000);
				expert1FirstnameText3.sendKeys("abhi");
				expert1LasttnameText3.sendKeys("anand");
				expert1CountrynameDropdown3.click();
				Select countryType3= new Select(expert1CountrynameDropdown3);
				countryType.selectByVisibleText("ALGERIA");
				Thread.sleep(3000);
				ShortbiographyText3.sendKeys("Test");
				institutionText3.sendKeys("oxford");
				Thread.sleep(5000);
				saveAndContinueStep3.click();
				
				// For Expert 4
				Thread.sleep(2000);
				expert1Email4.sendKeys("rajat.g123456@mailinator.com");
				expert1Email4.sendKeys(Keys.TAB);

				WebDriverWait wait4 = new WebDriverWait(driver,60);
				wait4.until(ExpectedConditions.alertIsPresent());
				Alert alert4 = driver.switchTo().alert();
				System.out.println(alert.getText());
				alert4.accept();
				
				expert1TitleDropdown4.click();
			
				Select uType4= new Select(expert1TitleDropdown4);
				uType4.selectByVisibleText("Prof.");
				Thread.sleep(3000);
				expert1FirstnameText4.sendKeys("abhi");
				expert1LasttnameText4.sendKeys("anand");
				expert1CountrynameDropdown4.click();
				Select countryType4= new Select(expert1CountrynameDropdown4);
				countryType.selectByVisibleText("ALGERIA");
				Thread.sleep(3000);
				ShortbiographyText4.sendKeys("Test");
				institutionText4.sendKeys("oxford");
				Thread.sleep(5000);
				saveAndContinueStep4.click();		
				// Complete Step 5
				Thread.sleep(1000);
				SubmitStep5.click();
			
	}
	
	public void startSubmissionStep6() {
		SubmitStep6.click();
	}
	
}

