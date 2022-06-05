package com.amazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazonUtility.BaseClass;

public class searchPage {
	
	public searchPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	
	@FindBy(id ="twotabsearchtextbox")
	public WebElement searchBox;

	@FindBy(id = "nav-search-submit-button")
	public WebElement submitBtn;
	
	public void clickSearchBox() {
		searchBox.click();
	}
	
	public void clearSearchBox() {
		searchBox.clear();
	}
	
	public void clickSearchBtn() {
		submitBtn.click();
	}
	
	public void searchItem() throws InterruptedException {
		searchBox.sendKeys(BaseClass.getProperty("searchItem"));
		Thread.sleep(3000);
	}
	
	

}
