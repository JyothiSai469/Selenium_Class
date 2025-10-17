/*QUESTION 6
-----------
URL : https://demo.automationtesting.in/Register.html
NOTE: print all the option of skills using getText() methods*/
package org.day9;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllSkillsPrint {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement skills = driver.findElement(By.id("Skills"));
		Thread.sleep(3000);
		//skills.click();
		skills.sendKeys(Keys.ENTER);
		
		Select s = new Select(skills);
		List<WebElement> options = s.getOptions();
		
		for (int i = 0; i < options.size(); i++) {
			
			String text = options.get(i).getText();
			
			System.out.println(text);	
		}
		
		Thread.sleep(4000);
		driver.quit();
}}
