package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.mystore.testcase.BaseClass;

public class myAccount extends BaseClass{
	
	WebDriver ldriver;
	public myAccount(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	
	@FindBy(id="username")
	WebElement Username;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="submit")
	WebElement SubmitBtn;
	
	@FindBy(xpath="//h1[text()='Logged In Successfully']")
	WebElement SuccessfullLoginText;
	
	@FindBy(xpath="//a[normalize-space()='Log out']")
	WebElement LogoutBtn;
	
	@FindBy(xpath="//div[@id='error' and contains(text(), 'Your username is invalid!')]")
	WebElement InvalidUser;
	
	@FindBy(xpath="//div[@id='error' and contains(text(), 'Your password is invalid!')]")
	WebElement InvalidPass;
	
	public void enterUsername(String emailid) {
	Username.sendKeys(emailid);
	}
	
	public void enterpassword(String password) {
		Password.sendKeys(password);
	}
	
	public void clickOnSubmit() {
		SubmitBtn.click();
		
	}
	
	public void urlValidation() {
		String Currenturl = driver.getCurrentUrl();
		Assert.assertEquals(Currenturl, "https://practicetestautomation.com/logged-in-successfully/", "URL does not match expected value.");
		System.out.println(Currenturl);
	}
	
	public void loginMesage() {
		SuccessfullLoginText.getText();
		String SuccessfullLoginMsg = SuccessfullLoginText.getText();
		Assert.assertEquals(SuccessfullLoginMsg, "Logged In Successfully", "Login message does not match expected value.");
		System.out.println(SuccessfullLoginMsg);
	}
	
	public void logOutBtnDisplay() {
		LogoutBtn.isDisplayed();
		String LogoutBtnText = LogoutBtn.getText();
		System.out.println(LogoutBtnText);
		LogoutBtn.click();
		
	}
	
	public void enterInvalidUserDetails() {
		InvalidUser.isDisplayed();
		String InavlidUserPopUp= InvalidUser.getText();
		System.out.println(InavlidUserPopUp);
		
	}
	
	public void enterInvalidPassDetails() {
		InvalidPass.isDisplayed();
		String InvalidPassword= InvalidPass.getText();
		System.out.println(InvalidPassword);
	}
	
	
}
