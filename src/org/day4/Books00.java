/*QUESTION 3: ---------- 
URL:https://compendiumdev.co.uk/ ------------------>  Click the Software blog  */
package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Books00 {
	
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://compendiumdev.co.uk/");
	
		WebElement soft = driver.findElement(By.xpath("(//a[text()='Software Blog'])[1]"));
		
		soft.click();
	}

}

