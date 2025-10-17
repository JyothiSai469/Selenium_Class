/*QUESTION 2 ------------ 
URL : https://www.flipkart.com/ 
NOTE: Search watch and take the screenshot. */
package org.day8;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/ ");
		
		WebElement search = driver.findElement(By.className("Pke_EE"));
		search.sendKeys("watch");
		search.sendKeys(Keys.ENTER);

		TakesScreenshot s = (TakesScreenshot)driver;
		
		File f =s.getScreenshotAs(OutputType.FILE);
		
		File ff = new File("C:\\Users\\Jyothi Sai\\OneDrive\\Pictures\\Screenshots 1\\flicartWatch.png");
		
		FileUtils.copyFile(f, ff);
		Thread.sleep(4000);
		driver.quit();
		
	}
}
