package com.amazonTests;

import org.testng.annotations.Test;

import com.amazonPages.searchPage;
import com.amazonUtility.BaseClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class searchTests {
	
	searchPage sp = new searchPage();

	@BeforeMethod
	public void setUp() {

		BaseClass.getDriver();
	}

	@AfterMethod
	public void tearDown() {
		BaseClass.tearDown();
	}

	@Test
	public void seachItem() throws InterruptedException {
		sp.clickSearchBox();
		sp.clearSearchBox();
		sp.searchItem();
		sp.clickSearchBtn();
		
	}

}
