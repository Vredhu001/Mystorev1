package com.mystore.testcase;




import org.testng.annotations.Test;

import com.mystore.pageobject.userSignupPage;

public class newUserSignupTest extends BaseClass{
	
	@Test
	public void verifyNewUserSignup() throws InterruptedException {
		driver.get(url);
		userSignupPage UserSignUp = new userSignupPage(driver);
		UserSignUp.newUserSignUp();
		
		
	}


}
