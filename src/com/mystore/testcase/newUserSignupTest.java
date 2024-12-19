package com.mystore.testcase;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.pageobject.userSignupPage;

public class newUserSignupTest extends BaseClass{
	
	@Test
	public void verifyNewUserSignup() {
		driver.get(url);
		userSignupPage UserSignUp = new userSignupPage(driver);
		UserSignUp.newUserSignUp();
		
	}
	
	
	
//	@Test
//	public void verifyNewUserRegistrationflow() {
//		driver.get(url);
//		userRegistrationPage UserReg = new userRegistrationPage(driver);
//		UserReg.newUserRegistration();
//		
//	}
	
	
	

}
