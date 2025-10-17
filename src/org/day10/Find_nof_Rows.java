/*QUESTION 1 
----------
URL : https://cosmocode.io/automation-practice-webtable/
NOTE: Find out Number of rows available in webPage*/
package org.day10;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_nof_Rows {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		WebElement table = driver.findElement(By.id("countries"));
		
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		
		System.out.println("No of Rows Available in WebPage: "+allRows.size());
		
//		System.out.println("Row Names");
//		
//		for (WebElement RowName : allRows) {
//			
//			System.out.println(RowName.getText());
//			
//		}
		
//		for (int i = 0; i < allRows.size(); i++) {
//			WebElement row = allRows.get(i);
//			System.out.println(row.getText());
//		}
		Thread.sleep(4000);
		driver.quit();
	}

}
