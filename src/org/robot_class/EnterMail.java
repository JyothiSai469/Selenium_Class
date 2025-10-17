/*QUESTION 1 ---------- 
URL :https://profile.w3schools.com/l 
NOTE:To Enter the value smart in emailfield The same value enter into the password field using robot class. */
package org.robot_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EnterMail {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://profile.w3schools.com/login");
		
		Thread.sleep(3000);
		WebElement text = driver.findElement(By.xpath("//input[@placeholder='email']"));
		
		Actions a = new Actions(driver);
		Thread.sleep(1000);
		a.sendKeys(text,"smart").perform();
		Thread.sleep(1000);
		
		a.doubleClick().perform();
		a.contextClick().perform();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(8000);
		driver.quit();
		
		
		
		
	}

}
