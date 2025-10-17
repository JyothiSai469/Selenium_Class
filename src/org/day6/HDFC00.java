/*QUESTION 7 ---------- 

URL : https://netbanking.hdfcbank.com/netbanking/ 
NOTE: Enter the userId,click continue.Enter password. */
package org.day6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFC00 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	
	Thread.sleep(1000);
	WebElement f = driver.findElement(By.xpath("//frame[@name='login_page']"));
	driver.switchTo().frame(f);
	
	 WebElement name = driver.findElement(By.xpath("//input[@class='form-control text-muted']"));
	 name.sendKeys("JyothiSai");

	driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
	Thread.sleep(3000);
	
	Thread.sleep(3000);
	//WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	WebElement pass = driver.findElement(By.id("keyboard"));
	pass.sendKeys("1234");
	pass.click();

	
	
//	Thread.sleep(2000);
//	Alert a = driver.switchTo().alert();
//	a.accept();
//	
	
	Thread.sleep(4000);
	driver.quit();
}
}



