package com.quaconsulting.week3;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
	public static WebDriver getWebDriver(String browser) {
		if ("chrome".equalsIgnoreCase(browser)) {
			return new ChromeDriver();}
			else if ("firefox".equalsIgnoreCase(browser)) {
				System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\eclipse-workspace\\week3");
				return new FirefoxDriver();
			}
			else {
			return new ChromeDriver();
			
		}
	}
}

