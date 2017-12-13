package com.quaconsulting.week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class ClothesBanner {
	@FindBy(css="#block_top_menu > ul > li:nth-child(1) > ul")
	private WebElement women;
	@FindBy(css="#block_top_menu > ul > li:nth-child(1) > a")
	private WebElement dresses;
	@FindBy(css="#block_top_menu > ul > li:nth-child(3) > a")
	private WebElement tshirts;
	
	public void clickWomen() {
		women.click();
	}
	public void clickDresses() {
			dresses.click();
	}
	public void clickTshirts() {
		tshirts.click();
	
	}
}
