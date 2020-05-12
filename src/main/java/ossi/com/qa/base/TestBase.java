package ossi.com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import ossi.com.qa.util.TestUtil;
import ossi.com.qa.util.WebEventListener;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;	
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	public TestBase() {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\rajat.garg\\eclipse-workspace\\OSSI\\src\\main\\"
					+"java\\ossi\\com\\qa\\config\\config.properties");
		
			prop.load(ip);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

public static void initialization() {
	
	String browserName = prop.getProperty("browser");
	if(browserName.equals("chrome")) {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "/D:/Selenium/Browser Driver/chromedriver.exe/");
		driver = new ChromeDriver();
	}else if(browserName.equals("FF")) {
		System.setProperty("webdriver.gecko.driver", "/D:/Selenium/Browser Driver/geckodriver.exe/");
		driver = new FirefoxDriver();
	}
	
	// Event Listener for action log
	e_driver = new EventFiringWebDriver(driver); 
	eventListener = new WebEventListener();
	e_driver.register(eventListener);
	driver = e_driver;
	
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	driver.findElement(By.id("details-button")).click();
	driver.findElement(By.id("proceed-link")).click();
}
}