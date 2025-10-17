/*ESTION 3: --------- 
URL:https://www.bwana.in/ecommerce-management.php 
[ Move ur cursor to services and click Web Development ] */
package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bwavana {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bwana.in/ecommerce-management.php");
		
		WebElement service = driver.findElement(By.xpath("(//a[text()='Services'])[1]"));
		
		Actions a = new Actions(driver);
		a.moveToElement(service).perform();
		service.click();
		
		Thread.sleep(2000);
		
		WebElement web = driver.findElement(By.xpath("(//a[text()='Web Development'])[1]"));
		
		a.moveToElement(web).perform();
		
	}

}
