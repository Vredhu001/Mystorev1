package com.mystore.testcase;

import org.testng.Assert;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.mystore.pageobject.userSignInPage;
import com.mystore.utilities.ReadConfig;




public class userSignInFlow extends BaseClass{
	ReadConfig read = new ReadConfig();
	
	@Test
	public void verifyUserSignInFlow() {
		driver.get(url);
		userSignInPage signInPage = new userSignInPage(driver);
		
		signInPage.userSignIn(read.getUserName(), read.getUserPassword());
		
	}

	

}
