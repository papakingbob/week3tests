package com.quaconsulting.week3;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class qatest {
	private WebDriver webDriver;
	
	@Before
	public void setUp() {
		webDriver = new ChromeDriver();
	}
	
@Test
public void exampleTest() {
webDriver.navigate().to("https://www.google.com");
GooglePage googlepage = PageFactory.initElements(webDriver, GooglePage.class);
googlepage.enterQuery("QA \n");
googlepage.clickQalink();
QAPage qaHomePage = PageFactory.initElements(webDriver, QAPage.class);
qaHomePage.clickconsultant();
try {
	TimeUnit.SECONDS.sleep(3);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
qaHomePage.clickconsultant();
}





@After
public void tearDown(){;
webDriver.quit();
}
}

	


 