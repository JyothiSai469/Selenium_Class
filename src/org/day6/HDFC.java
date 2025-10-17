/*QUESTION 4 --------- 
URL : 
https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212
608727520.1532670997 
NOTE: Click continue without enter the user id and handle popup. */
package org.day6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFC {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212");
	
	Thread.sleep(1000);
	WebElement f = driver.findElement(By.xpath("//frame[@name='login_page']"));

	driver.switchTo().frame(f);
//	 WebElement name = driver.findElement(By.xpath("//input[@class='form-control text-muted']"));
//	 name.sendKeys("JyothiSai");

	driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
	
	Thread.sleep(2000);
	Alert a = driver.switchTo().alert();
	a.accept();
	
	
	Thread.sleep(4000);
	driver.quit();
	}

}
