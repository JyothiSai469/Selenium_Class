/*QUESTION 9: -------- 
URL:https://www.facebook.com/ -----> Click create new account button and Fill all the details*/
package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();
		
		WebElement name = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		name.sendKeys("Jyothi");
		
		WebElement name1 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		name1.sendKeys("Sai");
		
		WebElement day = driver.findElement(By.id("day"));
		day.sendKeys("31");
		
		Thread.sleep(2000);
		WebElement mon = driver.findElement(By.id("month"));
		mon.sendKeys("Jul");
		
		WebElement year = driver.findElement(By.id("year"));
		year.sendKeys("1998");
		
		WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		gender.click();
		
		WebElement celnum = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		celnum.sendKeys("123456789");
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("123456789");
		
		Thread.sleep(8000);
		driver.quit();
	}

}
