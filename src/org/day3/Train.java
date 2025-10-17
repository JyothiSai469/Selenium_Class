/*QUESTION 6: --------- 
URL : https://www.cleartrip.com/trains-------------> Enter From ,TO  and click search trains */
package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Train {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		
		  WebElement from = driver.findElement(By.id("from_station"));
		  from.sendKeys("SriKalahasti");
		  
		  WebElement to = driver.findElement(By.id("to_station"));
		  to.sendKeys("Chennai");
		  
		  Thread.sleep(2000);
		  
		 WebElement button = driver.findElement(By.id("trainFormButton"));
		 
		 button.click();
	}

}
