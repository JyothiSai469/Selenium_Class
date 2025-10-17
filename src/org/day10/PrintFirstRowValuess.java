/*QUESTION 5
----------
URL : http://demo.guru99.com/test/write-xpath-table.html
NOTE: Print all value in first row*/
package org.day10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintFirstRowValuess {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		
		WebElement table = driver.findElement(By.xpath("//tbody"));
		//System.out.println(table.getText());
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		WebElement firstRow = rows.get(0);
		List<WebElement> datas = firstRow.findElements(By.tagName("td"));
		//System.out.println(firstRow.getText());
		for (WebElement data : datas) {
			
			System.out.println(data.getText());
			
		}
		
		
		Thread.sleep(5000);
		driver.quit();
	}
}
