/*QUESTION 2 ----------- 
URL : http://toolsqa.com/ 
NOTE: Go to "Live E-Commerce Project" using scrolldown.*/
package org.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toolsqa {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://toolsqa.com/");
		
		WebElement selenium = driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]"));
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", selenium);
		
		WebElement scr = driver.findElement(By.className("curriculum__card--sub-title"));
		js.executeScript("arguments[0].scrollIntoView(false)", scr);
		
		Thread.sleep(4000);
		//driver.quit();
	}
}
 	