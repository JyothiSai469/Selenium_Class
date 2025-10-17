/*UESTION 1 ---------- 
URL :https://www.youtube.com/ 
NOTE: Take screenshot of homepage. */
package org.day8;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
		TakesScreenshot t = (TakesScreenshot)driver;
		File f =t.getScreenshotAs(OutputType.FILE);
		
		File ff = new File("C:\\Users\\Jyothi Sai\\OneDrive\\Pictures\\Screenshots 1\\youtube.png");
		
		FileUtils.copyFile(f, ff);
		
		Thread.sleep(4000);
		driver.quit();
	}

}
