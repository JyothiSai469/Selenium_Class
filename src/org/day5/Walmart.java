/*QUESTION 2: ---------  
URL:https://www.walmart.com/all-departments 
[ Click Gift finder and move ur cursor to Electronics ] */
package org.day5;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Walmart {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.walmart.com/all-departments");
		
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search Walmart']"));
		search.sendKeys("Electronics");
		
		WebElement sc = driver.findElement(By.xpath("//button[@aria-label='Search']"));

		
	}

}
