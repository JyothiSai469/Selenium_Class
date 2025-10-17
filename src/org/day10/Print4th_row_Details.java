/*QUESTION 2
----------
URL : https://cosmocode.io/automation-practice-webtable/
NOTE: Print all details available in 4th row webtable*/
package org.day10;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print4th_row_Details {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		WebElement table = driver.findElement(By.id("countries"));
		
		List<WebElement> AllRow = table.findElements(By.tagName("tr"));
		
		WebElement perticularRow = AllRow.get(4);
		
		List<WebElement> data = perticularRow.findElements(By.tagName("td"));
		
		System.out.println("We Print the All Details Available in 4th Row WebTable: \n");
		
		for (int i = 0; i < data.size(); i++) {
			WebElement rowData = data.get(i);
			
			System.out.println(rowData.getText());
		}
		Thread.sleep(4000);
		driver.quit();
	}
}
