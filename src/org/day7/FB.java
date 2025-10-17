/*QUESTION 4 ----------- 
URL : https://www.facebook.com/ 
NOTE: Enter the email & password and click login button using 
JavaScript. */
package org.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		
		WebElement pass = driver.findElement(By.id("pass"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('value','Smart')", email);
		
		Thread.sleep(1000);
		js.executeScript("arguments[0].setAttribute('value','123')", pass);
		
		Thread.sleep(1000);
		WebElement btn = driver.findElement(By.xpath("//button[text()='Log in']"));
		js.executeScript("arguments[0].click();", btn);
		
		Thread.sleep(5000);
		driver.quit();
	}

}
