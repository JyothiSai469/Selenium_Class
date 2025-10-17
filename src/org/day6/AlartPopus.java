 /*QUESTION 2 ----------
URL : https://nxtgenaiacademy.com/alertandpopup/ 
NOTE: Click Alert with ok & cancel button and Click button to displayan confirm box Perform confirm alert. */
package org.day6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlartPopus {
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		Alert a= driver.switchTo().alert();
		
		Thread.sleep(1000);
		 String text = a.getText();
		 System.out.println(text);
		 Thread.sleep(1000);
		 a.dismiss();
		 
		 
		 Thread.sleep(4000);
		driver.quit();

	}
}
