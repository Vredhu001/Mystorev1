package com.mystore.pageobject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.mystore.testcase.BaseClass;

public class userSignupPage extends BaseClass {
	
	WebDriver ldriver;
	public userSignupPage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this); 
	}
	
	
	@FindBy(xpath ="//input[@placeholder='Name']")
	WebElement Name;
	
	@FindBy(xpath ="//input[@data-qa='signup-email']")
	WebElement Email;
	
	@FindBy(xpath ="//button[@data-qa='signup-button']")
	WebElement SignUpBtn;
	
	@FindBy(id= "id_gender1")
	WebElement Gender;
	
	@FindBy(id= "password")
	WebElement Password;
	
	@FindBy(id ="days")
	WebElement Bdays;
	
	@FindBy(id="days")
	WebElement Daysdropdown;
	
	@FindBy(id="months")
	WebElement Monthsdropdown;
	
	@FindBy(id="years")
	WebElement Yearsdropdown;
	
	@FindBy(id="newsletter")
	WebElement Newsltrbox;
	
	@FindBy(xpath ="//button[@data-qa='create-account']")
	WebElement CreateAcccount;
	
	@FindBy(xpath ="//input[@data-qa='first_name']")
	WebElement Firstname;
	
	@FindBy(xpath ="//input[@data-qa='last_name']")
	WebElement Lastname;
	
	@FindBy(xpath ="//input[@data-qa='address']")
	WebElement Address;
	
	@FindBy(xpath ="//input[@data-qa='mobile_number']")
	WebElement MobileNbr;
	
	@FindBy(xpath ="//input[@data-qa='state']")
	WebElement State;
	
	@FindBy(xpath ="//input[@data-qa='city']")
	WebElement City;
	
	@FindBy(xpath ="//input[@data-qa='zipcode']")
	WebElement Zipcode;
	
	public void newUserSignUp() throws InterruptedException {
		Name.sendKeys("Vikas");
		Email.sendKeys("vikas.singh@gmail.com");
		SignUpBtn.click();
		String Currenturl = driver.getCurrentUrl();
		Assert.assertEquals(Currenturl, "https://automationexercise.com/signup", "Incorrect Url");
		System.out.println(Currenturl);
		Gender.click();
		Password.sendKeys("Noida@123");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,1000)");

		Daysdropdown.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Select selectdays = new Select (Daysdropdown);
		System.out.println(Daysdropdown);
		selectdays.selectByValue("8");
		
		Monthsdropdown.click();
		Select selectmonths = new Select (Monthsdropdown);
		selectmonths.selectByValue("7");
		
		Yearsdropdown.click();
		Select selectyears = new Select (Yearsdropdown);
		selectyears.selectByValue("1990");
		
		Newsltrbox.click();
		Firstname.sendKeys("Vikas1");
		Lastname.sendKeys("Redhu");
		Address.sendKeys("Jind");
		js.executeScript("window.scrollBy(0,2000)");
		State.sendKeys("Haryana");
		City.sendKeys("Hissar");
		Zipcode.sendKeys("123321");
		MobileNbr.sendKeys("2323232323");
		Thread.sleep(20);
		CreateAcccount.click();
		//driver.close();
			
		
	}
	
	
	
	
}
