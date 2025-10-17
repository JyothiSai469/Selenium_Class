/*QUESTION 7
----------
URL : https://www.flipkart.com/
NOTE: Search mask and click any mask. Enter delivery pincode
*/
package org.day11;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart00 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		search.sendKeys("mask");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		WebElement mask = driver.findElement(By.xpath("//img[@alt='Vaghani 3 Ply Polluation Mask 50 Pcs ( Blue )( 75 Gsm )( Export ) Surgical Mask With Melt Blown Fabric Layer']"));
		mask.click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		for (String st : windowHandles) {
			driver.switchTo().window(st);
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ _3Yl67G _7Pd1Fp']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@maxlength='auto']")).sendKeys("7702012469");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();
	}

}
