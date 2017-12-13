package com.quaconsulting.week3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;


public class QAPage {
@FindBy(css="iv.owl-item:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > a:nth-child(4)\"")
private WebElement graduateLink;
@FindBy(css="\"#carousel-consulting\"")
private WebElement consultantLink;

	
	public void clickconsultant( ) {
		consultantLink.click();
}
	public void clickGraduate( ) {
		graduateLink.click();
}
}
