package com.quaconsulting.week3;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ClothesTest {
	WebDriver webDriver;
private static ExtentReports report ;
	

	@BeforeClass
	public static void init() {
		report= new ExtentReports();
		String fileName="Clothes"+".html";
		String filePath=System.getProperty("user.dir")
				+File.separatorChar + fileName;
		report.attachReporter(new ExtentHtmlReporter(filePath));
		
	}
	@Before
	public void setUp() {
		String fileName=System.getProperty("user.dir")
				+File.separatorChar + "testInfo.xlsx";
		SpreadSheetReader ssr= new SpreadSheetReader(fileName);
		List<String> row =ssr.readrow(1,"Sheet1");
	 webDriver = WebDriverFactory.getWebDriver(row.get(3));
	 
	}
		
	@Test
	public void Test() {
		
		String fileName=System.getProperty("user.dir")
				+File.separatorChar + "testInfo.xlsx";
		SpreadSheetReader ssr= new SpreadSheetReader(fileName);
		List<String> row =ssr.readrow(1,"Sheet1");
		webDriver.navigate().to(row.get(0));
		WomenPage wp= PageFactory.initElements(webDriver,WomenPage.class);
		ExtentTest test = report.createTest("LoginTest");
		test.log(Status.INFO, "FilterTest is Starting ");
		test.log(Status.INFO, "clicking dress filter");
		System.out.println("blue");
		wp.dressFilterClick();

		test.log(Status.DEBUG, "obtains the text for the webelement that contains text  stating how  manny products are on display");
		try{
			
		assertEquals("Failed",wp.getDisplayCount(),"There are 5 products");
		test.pass("passed");}
		catch (AssertionError e) {
		try {
			test.addScreenCaptureFromPath(ScreenShot.take(webDriver, "FailScreenshot"));
			}
		catch(IOException m) {
		System.out.println("screenshot failed");
		}
			test.fail("failed");
		throw e;
		}}
		
	@After
	public void tearDown(){
	webDriver.quit();
	
	}
}
	
