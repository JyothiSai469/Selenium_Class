/*QUESTION 4 ------------ 
URL : https://www.flipkart.com/ 
NOTE: Mouse Over Home & Furniture and take the screenshot.*/
package org.day8;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipcart00 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement home = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.moveToElement(home).perform();
		
		TakesScreenshot s = (TakesScreenshot)driver;
		
		File f =s.getScreenshotAs(OutputType.FILE);
		File ff = new File("C:\\\\\\\\Users\\\\\\\\Jyothi Sai\\\\\\\\OneDrive\\\\\\\\Pictures\\\\\\\\Screenshots 1\\\\filp.png");
		FileUtils.copyFile(f, ff);
		
		Thread.sleep(3000);
		//driver.quit();
	}
}
