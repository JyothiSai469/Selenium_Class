/*QUESTION 8
----------
URL : https://www.flipkart.com/
NOTE: Search hp laptop and click 1st hp laptop. print cost of laptop
*/
package org.day11;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart01 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		search.sendKeys("hp laptop");
		search.sendKeys(Keys.ENTER);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='HP Victus AMD Ryzen 7 Octa Core 8845HS - (16 GB/512 GB SSD/Windows 11 Home/6 GB Graphics/NVIDIA GeForc...']")).click();
		
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
