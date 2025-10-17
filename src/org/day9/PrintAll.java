/*QUESTION 1
----------
URL : https://www.globalsqa.com/demo-site/select-dropdown-menu/
NOTE: print all the even option in State*/
package org.day9;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAll {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement select = driver.findElement(By.xpath("//select"));
		select.sendKeys(Keys.ENTER);
		
		Select a = new Select(select);
		boolean mul = a.isMultiple();
		System.out.println(mul);
		System.out.println("\n"+" Print All the Even Option in State");
		
		List<WebElement> options = a.getOptions();
		for (int i = 0; i < options.size(); i++) {
			if ((i+1) % 2==1) {
				System.out.println(i +" = "+options.get(i).getText());
			}
			
		}
//		for (WebElement w : options) {
//			System.out.println(w.getText());	
//		}	
		Thread.sleep(4000);
		driver.quit();
	}
}
