/*QUESTION 12
-----------
URL : https://demoqa.com/select-menu
NOTE: Select Even Option availble in Standard multi select
Find out number of option not selected*/
package org.day9;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoTool {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");	
		
		WebElement sel = driver.findElement(By.id("cars"));
		
		Select s = new Select(sel);
		List<WebElement> options = s.getOptions();
		
		System.out.println("Select Even Option: ");
		
		for (int i = 0; i < options.size(); i++) {
			
			if (i%2==0) {
				s.selectByIndex(i);
				System.out.println(options.get(i).getText());
			}
			
		}
		System.out.println("Number of option not selected");
			
		int unselect=0;
			for (int i = 0; i < options.size(); i++) {
				if (!options.get(i).isSelected()) {
					unselect++;
					System.out.println(options.get(i).getText());
				}
			}
			
			Thread.sleep(4000);
			driver.quit();
		}
		
		
	}



