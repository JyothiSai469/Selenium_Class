/*QUESTION 6: --------- 
URL:http://www.flipkart.com 
[ Move ur cursor Home & Furniture then click bedsheets ] */
package org.day5;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
	
		Thread.sleep(1000);
		WebElement login = driver.findElement(By.xpath("//span[text()='Login']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(login).perform();
		
		Thread.sleep(1000);
		WebElement home = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		
		Thread.sleep(1000);
		a.moveToElement(home).perform();
		
		Thread.sleep(1000);
		WebElement bed = driver.findElement(By.xpath("//a[text()='Bed Linens']"));
		a.moveToElement(bed).perform();
		
		Thread.sleep(10000);
		driver.quit();
	}

}
