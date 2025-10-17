/*QUESTION 2 ---------- 
URL :https://www.edureka.co/ 
NOTE:to click the courses search selenium and click enter. */
package org.robot_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Edureka {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.edureka.co/");
		
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.className("navbar_search_bx__1IWnI"));
		
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		a.click(search).perform();
		
		Thread.sleep(1000);
		WebElement search1 = driver.findElement(By.xpath("//input[@type='search']"));
		Actions aa= new Actions(driver);
		aa.sendKeys(search1,"selenium").perform();
		Thread.sleep(500);
		aa.click(search1);
				  
	}

}
