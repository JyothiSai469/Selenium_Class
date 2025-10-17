/*QUESTION 7 -------------- 
URL : http://toolsqa.com/ 
NOTE: Scrolldown till "Recent Articles".*/
package org.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tools {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://toolsqa.com/");
		
		//driver.manage().window().maximize();
		
		WebElement articles = driver.findElement(By.xpath("//div[text()='Articles']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(false)", articles);
		
		Thread.sleep(4000);
		//driver.quit();

	}

}
