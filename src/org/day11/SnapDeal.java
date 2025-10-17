/*QUESTION 3
----------
URL : https://www.snapdeal.com/
NOTE: Search watch and click 1st watch add it to cart. print the you pay cost displayed.*/
package org.day11;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	
	WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search products & brands']"));
	search.sendKeys("watch");
	search.sendKeys(Keys.ENTER);
	
	WebElement watch = driver.findElement(By.xpath("(//img[@class='product-image '])[1]"));
	watch.click();
	
	Set<String> win = driver.getWindowHandles();
	for (String s : win) {
		driver.switchTo().window(s);
	}
	driver.findElement(By.xpath("//span[text()='add to cart']")).click();
	Thread.sleep(1000);
	WebElement cost = driver.findElement(By.xpath("(//span[@class='price'])[2]"));
	System.out.println("Watch Price: "+cost.getText());
	
	Thread.sleep(5000);
	//driver.quit();
}
}
