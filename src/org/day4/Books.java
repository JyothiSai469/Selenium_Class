/*QUESTION 2: --------- 
URL:https://compendiumdev.co.uk/ ------------------>  
Get the text starts from Books published by...........*/
package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Books {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://compendiumdev.co.uk/");
		
		WebElement letter = driver.findElement(By.xpath("//p[contains(text(),'Books')]"));
		String l = letter.getText();
		System.out.println(l);
	}

}
