/*QUESTION 9 ---------- 
URL : https://www.demoblaze.com/ 
NOTE: click Login without enter the user id & password. */
package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;import javax.swing.text.TabableView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demoplaza {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.id("signin2")).click();
		
		
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.id("sign-username"));
		//email.sendKeys("JyothiSai123");
		
		Actions aa = new Actions(driver);
		
		aa.keyDown(email,Keys.SHIFT).perform();
		aa.sendKeys("jyothisai").perform();
		aa.keyUp(email,Keys.SHIFT).perform();
		
		aa.doubleClick(email).perform();
		aa.contextClick(email).perform();
		
		Robot ro = new Robot();
		
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyRelease(KeyEvent.VK_DOWN);
		
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyRelease(KeyEvent.VK_DOWN);
		
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyRelease(KeyEvent.VK_DOWN);
		
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		
		ro.keyPress(KeyEvent.VK_TAB);
		ro.keyRelease(KeyEvent.VK_TAB);
		
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_V);
		
		ro.keyRelease(KeyEvent.VK_CONTROL);
		ro.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(5000);
		driver.quit();
	}
}
