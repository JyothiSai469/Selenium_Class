/*QUESTION 4
----------
URL : https://www.facebook.com/
NOTE: Print all the options in month using getText() method*/
package org.day9;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB00 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement create = driver.findElement(By.xpath("//a[text()='Create new account']"));
		create.click();
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select s = new Select(month);	
		List<WebElement> op = s.getOptions();
		
		for (int i = 0; i < op.size(); i++) {
			String out = op.get(i).getText();
			System.out.println(out);
		}
		
//		for (WebElement opp : op) {
//			System.out.println(opp.getText());	
//		}
		Thread.sleep(4000);
		driver.quit();
	}

}
