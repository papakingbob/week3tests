package com.quaconsulting.week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BannerPage {
	
	@FindBy(css=".auto-style1 > form:nth-child(8) > div:nth-child(1) > center:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > p:nth-child(1) > input:nth-child(1)")
	private WebElement username;

	@FindBy(css=".auto-style1 > form:nth-child(8) > div:nth-child(1) > center:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(2) > p:nth-child(1) > input:nth-child(1)")
	private WebElement password;

	@FindBy(css=".auto-style1 > form:nth-child(8) > div:nth-child(1) > center:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(3) > td:nth-child(2) > p:nth-child(1) > input:nth-child(1)")
	private WebElement check;

	@FindBy(css=".auto-style1 > big:nth-child(6) > blockquote:nth-child(1) > blockquote:nth-child(1) > font:nth-child(1) > center:nth-child(1) > b:nth-child(1)")
	private WebElement result;


	public void setUserName(String Query) {
		username.sendKeys(Query);
	}

	public void setPassword(String Query) {
		password.sendKeys(Query);
	}
	
	public void clickCheck() {
		check.click();
	}
		public String getResult() {
			return result.getText();
	}

}