/*QUESTION 4 ---------- 
URL : http://demo.guru99.com/test/write-xpath-table.html 
NOTE: Print all the content in the dymaic webtable. */
package org.day10;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAll {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		
		WebElement table = driver.findElement(By.xpath("//tbody"));
		//System.out.println(table.getText());
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (WebElement tr : rows) {
			
			List<WebElement> cells = tr.findElements(By.tagName("td"));
			for (WebElement data : cells) {
				
				System.out.println(data.getText());
			}
			System.out.println("\n");
		}
		Thread.sleep(4000);
		driver.quit();
		
	}
	

}
