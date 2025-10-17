/*QUESTION 3 
---------- 
URL : https://demoqa.com/webtables 
NOTE: Print Even rows available in 2 nd cell */
package org.day10;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EvenRollCell {
	
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/webtables");
	
	WebElement AllTable = driver.findElement(By.cssSelector(".rt-table"));

	List<WebElement> Rows = AllTable.findElements(By.cssSelector(".rt-tr-group"));
	 System.out.println("Even row 2nd cell values:");
	 
	 for (int i = 0; i < Rows.size(); i++) {
		if (i%2 != 0) {
			
			List<WebElement> data = Rows.get(i).findElements(By.className("rt-td"));
			if (data.size()>1) {
				
				System.out.println(data.get(1).getText());
				
			}
		}
	}
	
//	WebElement perticularCell = Rows.get(2);
//List<WebElement> cell = perticularCell.findElements(By.xpath("(//div[@class='rt-tr-group'])[2]"));	
//	
//	for (WebElement data : cell) {
//		System.out.println(data.getText());
//		if (data<=2) {
//			System.out.println(data.getText());
//
//		}
//	}
	
	Thread.sleep(4000);
	driver.quit();
	}

}
