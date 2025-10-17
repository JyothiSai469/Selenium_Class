/*QUESTION 5
----------
URL : https://www.snapdeal.com/
NOTE: Search hand sanitizer and click any hand sanitizer add it to cart*/
package org.day11;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal00 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search products & brands']"));
		search.sendKeys("hand sanitizer");
		search.sendKeys(Keys.ENTER);
		
		WebElement watch = driver.findElement(By.xpath("(//img[@class='product-image '])[1]"));
		watch.click();
		Set<String> win = driver.getWindowHandles();
		for (String s : win) {
			driver.switchTo().window(s);
		}
		driver.findElement(By.xpath("//span[text()='add to cart']")).click();
	}

}
