package com.quaconsulting.week3;
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.Before;


public class DemoTest {
	WebDriver webDriver;
	
	
	private static ExtentReports report ;
	

	@BeforeClass
	public static void init() {
		report= new ExtentReports();
		String fileName="MyReport"+".html";
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
		System.out.println(row.get(3));
	 webDriver = WebDriverFactory.getWebDriver(row.get(3));
	 
	}
		
	@Test
	public void Test() {
		String fileName=System.getProperty("user.dir")
				+File.separatorChar + "testInfo.xlsx";
		SpreadSheetReader ssr= new SpreadSheetReader(fileName);
		List<String> row =ssr.readrow(1,"Sheet1");
		webDriver.navigate().to(row.get(0));
		BannerPage bp = PageFactory.initElements(webDriver,BannerPage.class);
		bp.clickAddUser();
		AddUserPage aup= PageFactory.initElements(webDriver,AddUserPage.class);
		ExtentTest test = report.createTest("LoginTest");
		test.log(Status.INFO, "LoginTest is Starting ");
		test.log(Status.INFO, "entering username Josh");
		aup.setUserName(row.get(1));
		test.log(Status.INFO, "entering password");
		aup.setPassword(row.get(2));
		test.log(Status.INFO, "saving login infomation");
		aup.clickSave();
		test.log(Status.INFO, "navigating to login page");
		aup.clickLogin();
		LoginPage lp = PageFactory.initElements(webDriver,LoginPage.class);
		test.log(Status.INFO, "entering username previously set");
		lp.setUserName(row.get(1));test.log(Status.INFO, "entering password previously set");
		lp.setPassword(row.get(2));
		lp.clickCheck();
		test.log(Status.INFO, "checkin succesful login");
		test.log(Status.DEBUG, "obtains the text for the webelement that report the login outcome and compare it aginst a Successful Login");
		try{
			
		assertEquals("Failed",lp.getResult(),"**Successful Login**");
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
	@AfterClass
	public static void clearUp() {
	report.flush();
	}
	}

