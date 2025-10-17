/*QUESTION 3 ----------- 
URL : https://www.snapdeal.com/login 
NOTE: : Enter the mobile number and click continue button using 
JavaScript. */
package org.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/login");
		
		WebElement id = driver.findElement(By.id("userName"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('value','jyothisai46@gmail.com')", id);
		
		Thread.sleep(1000);
		WebElement chek = driver.findElement(By.id("checkUser"));
		js.executeScript("arguments[0].click();", chek);
		
		
		Thread.sleep(4000);
		//driver.quit();
	}

}
