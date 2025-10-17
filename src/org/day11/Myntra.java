/*QUESTION 2
----------
URL : https://www.myntra.com/
NOTE: Search toys and click 1st toy add it to cart.
print the you pay cost displayed*/
package org.day11;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		Thread.sleep(2000);
		search.sendKeys("toy");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		WebElement toy = driver.findElement(By.xpath("//img[@src='https://assets.myntassets.com/dpr_2,q_60,w_210,c_limit,fl_progressive/assets/images/2025/FEBRUARY/22/5Qsvyvjv_5fe60d4363a3472ebf3f5a8b1680901c.jpg']"));
		toy.click();
		
		Set<String> win = driver.getWindowHandles();
		for (String s : win) {
			driver.switchTo().window(s);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Bag']")).click();
		WebElement price = driver.findElement(By.xpath("//span[text()='1,019']"));
		System.out.println("Total Amount: "+price.getText());
		
		Thread.sleep(4000);
		//driver.quit();
	}

}
