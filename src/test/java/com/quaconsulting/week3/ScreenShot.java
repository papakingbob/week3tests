package com.quaconsulting.week3;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
public class ScreenShot {

	public static String take(WebDriver webDriver, String fileName) throws IOException {
		File photoFile=((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
		String pathName = System.getProperty("user.dir")
				+File.separatorChar + fileName+".jpg";
		FileUtils.copyFile(photoFile,new File(pathName));
		System.out.println("File Saved at: " + pathName);
        return pathName;
		
	}
	
	
}
