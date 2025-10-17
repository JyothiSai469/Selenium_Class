/*UESTION 11: ---------- 
URL:https://www.justdial.com/Chennai/E-Commerce-Service-Providers/nct-11276455  -----> Click advertise 
and Fill the details */
package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class justdial {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.justdial.com/Chennai/E-Commerce-Service-Providers/nct-11276455");
		
		Thread.sleep(3000);
		
		WebElement adver = driver.findElement(By.xpath("//div[text()='Advertise']"));
		adver.click();
		
	}

}
