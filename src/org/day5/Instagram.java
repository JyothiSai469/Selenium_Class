/* 10: ---------- 
URL:https://www.instagram.com/ 
[ Pass the values to email and copy & paste it in password field ] */
package org.day5;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Instagram {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(3000);
		
		WebElement text = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		
		Actions a = new Actions(driver);
		
		a.keyDown(text, Keys.SHIFT).perform();
		a.sendKeys(text,"jyothi_sai").perform();
		a.keyUp(text,Keys.SHIFT).perform();
		
		Thread.sleep(1000);
		a.doubleClick().perform();
		a.contextClick().perform();
		
		Robot rb = new Robot();
		
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		
		
		Thread.sleep(15000);
		driver.quit();
	}
}
