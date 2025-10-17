/*URL : 
https://www.way2automation.com/way2auto_jquery/alert.php#load_box 
NOTE: Click Alert with textBox button and Click button to demonstratean prompt box Perform prompt alert. */
package org.day6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Way2SMS {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.way2automation.com/way2auto_jquery/alert.php#load_box");
		Thread.sleep(2000);
		
		WebElement tex = driver.findElement(By.xpath("//a[text()='Input Alert']"));
		tex.click();
		
		WebElement frame = driver.findElement(By.xpath("(//iframe[@class='demo-frame'])[2]"));
		driver.switchTo().frame(frame);
		
		Thread.sleep(2000);
		WebElement ok = driver.findElement(By.xpath("//button[text()='Click the button to demonstrate the Input box.']"));
		ok.click();
		
		Alert a = driver.switchTo().alert();
	
		System.out.println(a.getText());
		a.sendKeys("JyothiSai");
		Thread.sleep(5000);
		a.accept();
		
		
		Thread.sleep(4000);
		driver.quit();
	}
}
