package com.mystore.testcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import com.mystore.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	String url = readconfig.getBaseUrl();
	String browser = readconfig.getBrowser();
	
	public static WebDriver driver;
	
	@BeforeClass
	public void setup () {
		switch(browser.toLowerCase())
		{
		case "chrome":
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("ChromeBrowserrun");
		break;
		
		case "msedge":
			WebDriverManager.chromedriver().setup();
			driver = new EdgeDriver();
			break;
			
		case "firefox":
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();
			break;
			
		default:
			driver = null;
		break;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
			
	}
	
//	@AfterClass
//	public void tearDown() {
//	    if (driver != null) {
//	        driver.quit();
//	        System.out.println("Driver closed");
//	    }
//	}


}
