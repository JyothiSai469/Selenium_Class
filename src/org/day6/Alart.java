/*QUESTION 1: 
URL : https://www.way2automation.com/way2auto_jquery/alert.php#load_box 
NOTE: Click button to display an alert box and click ok button */
package org.day6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alart {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.way2automation.com/way2auto_jquery/alert.php#load_box");
		
		Thread.sleep(1000);
		
		WebElement f = driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(f);
		
		WebElement btn = driver.findElement(By.xpath("//button[text()='Click the button to display an alert box:']"));		
		
		
		btn.click();
		
		Thread.sleep(3000);

		Alert a = driver.switchTo().alert();
		a.accept();
		
		Thread.sleep(6000);
		driver.quit();
		
	}
}
//class="demo-frame"