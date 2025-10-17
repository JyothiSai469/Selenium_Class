/*QUESTION 4
----------
URL : https://www.homedepot.com/
NOTE: Search fan click 1st fan and click the remote control included*/
package org.day11;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homedeport {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		//driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[@type='search']"));
		search.sendKeys("fan");
		search.sendKeys(Keys.ENTER);
		
		  Thread.sleep(5000);
		  WebElement feature = driver.findElement(By.xpath("//p[text()='Fan Features']"));
		  Thread.sleep(2000);
		  feature.click();
		  
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//p[text()='Remote Control']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("(//button[text()='Apply'])[1]")).sendKeys(Keys.ENTER);
		
		Thread.sleep(4000);
		//driver.quit();
	}

}
