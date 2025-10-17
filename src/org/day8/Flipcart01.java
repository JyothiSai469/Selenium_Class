/*QUESTION 6
-----------
URL : https://www.snapdeal.com/
NOTE: search iphone 14 pro and take the screenshot .*/
package org.day8;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart01 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search products & brands']"));
		Thread.sleep(2000);
		search.sendKeys("iphone 14 pro");
		search.sendKeys(Keys.ENTER);
		
		TakesScreenshot s = (TakesScreenshot)driver;
		
		File f = s.getScreenshotAs(OutputType.FILE);
		
		File ff = new File("C:\\Users\\Jyothi Sai\\OneDrive\\Pictures\\Screenshots 1\\iphone.png");
		
		FileUtils.copyFile(f, ff);
		
		Thread.sleep(4000);
		driver.quit();
		
	}

}
