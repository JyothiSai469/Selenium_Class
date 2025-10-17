/*QUESTION 8: ---------- 
URL: https://www.shopclues.com/wholesale.html  ------------>
Search any product and click 1st product */
package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ShopClues {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		
		Thread.sleep(3000);
		
		WebElement search = driver.findElement(By.id("autocomplete"));
		search.sendKeys("T-Shirts");
		search.sendKeys(Keys.ENTER);
		
		Thread.sleep(1000);
		
		WebElement shirt = driver.findElement(By.xpath("//h2[text()='Redline Mens V-Neck T-Shirt']"));
		shirt.click();
	}
}
