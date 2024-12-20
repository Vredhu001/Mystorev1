package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.mystore.testcase.BaseClass;

public class userSignInPage extends BaseClass{
	
	WebDriver ldriver;
	public userSignInPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath ="//input[@data-qa='login-email']")
	WebElement UserEmail;
	
	@FindBy(xpath ="//input[@data-qa='login-password']")
	WebElement UserPassword;
	
	@FindBy(xpath ="//button[@data-qa='login-button']")
	WebElement LogginButton;
	
	
	public void userSignIn(String username, String password) {
		UserEmail.sendKeys(username);
		UserPassword.sendKeys(password);
		LogginButton.click();
		
		
	}
	

	
}
