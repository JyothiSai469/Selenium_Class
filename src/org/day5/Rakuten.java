/*QUESTION 1: -------- 
URL:https://corp.rakuten.co.in/ 
[ Move ur cursor to our culture and click Awards & Recognition ] */
package org.day5;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rakuten {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
				driver.get("https://corp.rakuten.co.in/");
				driver.manage().window().maximize();
				
				WebElement culture = driver.findElement(By.xpath("(//a[text()='Our Culture'])[1]"));
				
				Actions a = new Actions(driver);
				a.moveToElement(culture).perform();
				
				WebElement award = driver.findElement(By.xpath("(//a[text()='Awards & Recognition'])[1]"));
				a.moveToElement(award).perform();
				
				award.click();
	
	
	}

}
