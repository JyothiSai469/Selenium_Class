/**/
package org.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
		WebElement beauty = driver.findElement(By.xpath("(//a[text()='Beauty'])[1]"));
		Actions a = new Actions(driver);
		
		a.moveToElement(beauty).perform();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
