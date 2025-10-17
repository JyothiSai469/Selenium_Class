/*QUESTION 6
----------
URL : https://www.flipkart.com/
NOTE: Search redmi phone and click any phone print price amount*/
package org.day11;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		search.sendKeys("redmi phone");
		search.sendKeys(Keys.ENTER);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='REDMI A3X (Olive Green, 128 GB)']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		for (String st : windowHandles) {
			driver.switchTo().window(st);
		}
		
		WebElement cost = driver.findElement(By.xpath("//div[@class='Nx9bqj CxhGGd']"));
		System.out.println("Cost Price of Redmi Phone: "+ cost.getText());
		
		Thread.sleep(4000);
		//driver.quit();
	}

	
}
