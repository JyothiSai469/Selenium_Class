/*QUESTION 13
-----------
URL : http://output.jsbin.com/osebed/2
NOTE: Select All availble in fruits*/
package org.day7;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllFruits {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://output.jsbin.com/osebed/2");
		
		WebElement fruits = driver.findElement(By.id("fruits"));
		
		Select s = new Select(fruits);
		
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			s.selectByIndex(i);
		}
		System.out.println("Select the all fruits");
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		
		for (WebElement w : allSelectedOptions) {
			System.out.println(w.getText());
			
			}
		}	
		
	}


