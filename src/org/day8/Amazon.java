/*QUESTION 3 ----------- 
URL : https://www.amazon.in/ 
NOTE: Search laptop and take the screenshot. */
package org.day8;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_6o3s351fev_e&adgrpid=150668181581&hvpone=&hvptwo=&hvadid=674842289449&hvpos=&hvnetw=g&hvrand=10468408646879690510&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9152562&hvtargid=kwd-300061672064&hydadcr=5621_2359492&gad_source=1");
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("laptop");
		Thread.sleep(1000);
		search.sendKeys(Keys.ENTER);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File f = ts.getScreenshotAs(OutputType.FILE);
		
		File ff = new File("C:\\\\Users\\\\Jyothi Sai\\\\OneDrive\\\\Pictures\\\\Screenshots 1\\amazonLaptop.png");
		
		FileUtils.copyFile(f, ff);
		
		Thread.sleep(4000);
		driver.quit();
	}
}
