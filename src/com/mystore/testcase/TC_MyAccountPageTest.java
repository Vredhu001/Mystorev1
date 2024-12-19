package com.mystore.testcase;

//import org.testng.Assert;
import org.testng.annotations.Test;


import com.mystore.pageobject.myAccount;




public class TC_MyAccountPageTest extends BaseClass{
	
	@Test 
	public void verifyPositiveLoginTest() {
		driver.get(url);
		myAccount account = new myAccount(driver);
		account.enterUsername("student");
		account.enterpassword("Password123");
		account.clickOnSubmit();
		account.urlValidation();
		account.loginMesage();
		account.logOutBtnDisplay();
		
		
	}
	
	@Test
	public void negativeLogintest() {
		driver.get(url);
		myAccount account = new myAccount(driver);
		account.enterUsername("student2");
		account.enterpassword("Password123");
		account.clickOnSubmit();
		account.enterInvalidUserDetails();
	}
	
	@Test
     public void negativePasswordtest() {
    	 driver.get(url);
 		myAccount account = new myAccount(driver);
 		account.enterUsername("student");
 		account.enterpassword("Password1234");
 		account.clickOnSubmit();
 		account.enterInvalidPassDetails();
	
}

}
