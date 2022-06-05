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

	@FindBy(xpath = "//*[@id='nav-search-submit-button']")
	public WebElement submitBtn;

	public void search() throws InterruptedException {
		searchBox.click();
		searchBox.clear();
		searchBox.sendKeys("TV");
		Thread.sleep(3000);
		submitBtn.click();
		
	}
	
	

}
