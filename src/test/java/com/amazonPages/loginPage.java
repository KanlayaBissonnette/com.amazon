package com.amazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazonUtility.BaseClass;

public class loginPage {

	public loginPage() {

		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	
	@FindBy(id = "nav-link-accountList-nav-line-1")
	public WebElement signinTab;
	
	@FindBy(id = "ap_email")
	public WebElement emailField;
	
	@FindBy(id = "continue")
	public WebElement continueBtn;
	
	@FindBy(id = "ap_password")
	public WebElement passwordField;
	
	@FindBy(id = "signInSubmit")
	WebElement signinBtn;

	public void clickSiginTab() {
		signinTab.click();
	}

	public void email_Login() {
		emailField.sendKeys(BaseClass.getProperty("email"));
		
	}
	public void clickContinueBtn() {
		continueBtn.click();
	}
	public void password_Login() {
		passwordField.sendKeys(BaseClass.getProperty("password"));
	}
	
	public void clickSignInBtn() {
		signinBtn.click();
	}

}
