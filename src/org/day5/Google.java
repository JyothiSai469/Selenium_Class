
/*QUESTION 9: ---------- 
URL:https://www.google.co.in/ 
[ Enter ur name and Double click ] */
package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement  search = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		search.sendKeys("Palamangalam Jyothi Sai");
		Thread.sleep(1000);
		
		Actions a = new Actions(driver);
		
		a.doubleClick(search).perform();
		
	}

}
