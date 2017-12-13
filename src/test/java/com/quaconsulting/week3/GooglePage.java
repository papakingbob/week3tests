package com.quaconsulting.week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;


public class GooglePage {
	@FindBy(css="#lst-ib")
	private WebElement searchBar;
	@FindBy(css="#rso > div:nth-child(1) > div > div:nth-child(1) > div > div > h3 > a")
	private WebElement qaLink;

	public void enterQuery(String Query) {
		searchBar.sendKeys(Query);
	}
	public void clickQalink() {
		qaLink.click();
	}
}
