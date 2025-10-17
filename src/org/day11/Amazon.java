/*QUESTION 1
----------
URL : https://www.amazon.com/
NOTE: Search iphones 14 pro and right click 1st phone and 
give openin new window .print cost of product*/
package org.day11;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_6o3s351fev_e&adgrpid=150668181581&hvpone=&hvptwo=&hvadid=674842289449&hvpos=&hvnetw=g&hvrand=17565629367922540482&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9152562&hvtargid=kwd-300061672064&hydadcr=5621_2359492&gad_source=1");
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphones 14 pro");
		search.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		WebElement iphone = driver.findElement(By.xpath("//span[text()='Apple iPhone 15 Pro (1 TB) - Natural Titanium']"));
		
		Actions a = new Actions(driver);
		a.contextClick(iphone).perform();
		
		Thread.sleep(3000);

		Robot rt = new Robot();
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		
		String parent = driver.getWindowHandle();
		
		Set<String> chaild = driver.getWindowHandles();
		
		for (String s : chaild) {
			if (!s.equals(parent)) {
				driver.switchTo().window(s);
				break;
			}
		}
		
		WebElement cost = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[5]"));
		System.out.println("iphone 14 pro cost: "+ cost.getText());
		

		
		Thread.sleep(4000);
		driver.quit();
		
		
	}

}
