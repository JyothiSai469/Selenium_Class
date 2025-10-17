/*QUESTION 4: --------- 
URL:https://www.globalsqa.com/demo-site/draganddrop/ 
[Drag the high tatras to Trash ] */
package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Globle {
	 
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		Thread.sleep(3000);
		
		WebElement img = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
		
		WebElement trach = driver.findElement(By.id("trash"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(img, trach).perform();
	}
}


//id="trash"
//WebElement iframe = driver.findElement(By.xpath("//iframe[contains(@data-src,'photo-manager.html')]"));
