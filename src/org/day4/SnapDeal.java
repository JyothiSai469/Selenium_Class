/*QUESTION 7: --------- 
URL:https://www.snapdeal.com/   -----------> 
Search HeadPhones and click the fst product*/
package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		
		WebElement search = driver.findElement(By.id("inputValEnter"));
		search.sendKeys("HeadPhones");
		
		Thread.sleep(2000);
		
		WebElement scrclk = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		scrclk.click();
	}

}
