/*QUESTION 5 ----------- 
URL : http://adactinhotelapp.com/ 
NOTE: Enter the username & password and click login button using 
JavaScript. */
package org.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactinhotelapp {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		
		WebElement idkey = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement passkey = driver.findElement(By.id("password"));
		WebElement loginkey = driver.findElement(By.id("login"));
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('value','smart')", idkey);
		
		Thread.sleep(1000);
		js.executeScript("arguments[0].setAttribute('value','123')",passkey);
		
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", loginkey);
		
		Thread.sleep(4000);
		//driver.quit();
	}

}
