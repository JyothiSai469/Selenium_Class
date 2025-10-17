/*QUESTION 3
----------
URL : https://www.facebook.com/
NOTE: Print all the options in year using getAttirubute() method*/
package org.day9;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement create = driver.findElement(By.xpath("//a[text()='Create new account']"));
		create.click();
		
		WebElement year = driver.findElement(By.id("year"));
		Select s = new Select(year);
		s.selectByValue("2024");
		
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		System.out.println("Print all the options in year using getAttirubute() method");
		
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			
			String at = options.get(i).getAttribute("value");
			System.out.println(at);
			//System.out.println(options.get(i).getText());
			
		}

		Thread.sleep(4000);
		driver.quit();
	}

}
