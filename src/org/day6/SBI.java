/*QUESTION 5 ---------
 
URL : https://retail.onlinesbi.sbi/retail/login.htm 
NOTE: Click Continue To Login and click Login without enter the userid. */
package org.day6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBI {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver= new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.className("login_button")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("Button2")).click();
		
		Alert a = driver.switchTo().alert();
		
		
		Thread.sleep(3000);
		a.accept();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
