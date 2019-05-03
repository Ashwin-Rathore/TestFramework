package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.crm.qa.util.WebEventListener;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	public TestBase() throws IOException {

		try {
			prop = new Properties();

			FileInputStream fis = new FileInputStream(
					"E:/JavaProject/JavaWorkspace/BDDFramework/src/main/java/com/crm/qa/configuration/config.properties");

			prop.load(fis);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	public static void initialization() throws IOException {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"E://Selenim Installations//Chrome Driver//chromedriver_win32//chromedriver.exe");
			driver = new ChromeDriver();
		} 
		else if (browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\GekoDriver\\geckodriver-v0.15.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	
		e_driver = new EventFiringWebDriver(driver);
		//Now create object of Event listener to register it with EventFiring Web Driver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver =e_driver;
				
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	//	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}

}
