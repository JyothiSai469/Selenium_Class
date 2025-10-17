/*QUESTION 7
-----------
URL : http://demo.guru99.com/test/newtours/register.php
NOTE: print all the option of country using getAttribute() method
Register Form*/
package org.day9;

import java.util.List;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllSkillsPrint00 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");		
		WebElement click = driver.findElement(By.xpath("//select[@name='country']"));
		
		Select s = new Select(click);
		List<WebElement> options = s.getOptions();
		
		for (int i = 0; i < options.size(); i++) {
			@Nullable
			String attribute = options.get(i).getAttribute("value");
			System.out.println(attribute);
		}
		
		Thread.sleep(4000);
		driver.quit();
	}

}
