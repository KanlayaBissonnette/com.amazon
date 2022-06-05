package com.amazonTests;

import org.testng.annotations.Test;

import com.amazonPages.loginPage;
import com.amazonUtility.BaseClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class loginTests {
	
	loginPage lp = new loginPage();
	
	@BeforeMethod
	public void setUp(){

		BaseClass.getDriver();
	}

	@AfterMethod
	public void tearDown() {
		BaseClass.tearDown();
	}

	   @Test(priority = 1)
	      public void login() {
		  lp.clickSiginTab();
		  lp.email_Login();
		  lp.clickContinueBtn();
		  lp.password_Login();
		  lp.clickSignIn();
	          
	  }

}
