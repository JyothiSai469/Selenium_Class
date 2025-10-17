/*QUESTION 6 --------- 
URL:https://www.techlistic.com/p/selenium-practice-form.html 
[Just enter the values for the textbox only.] */
package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TechlisticJustClick {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		Thread.sleep(2000);
		
		WebElement TrackPhoneCall = driver.findElement(By.xpath("(//span[@class='m_ n_ si34 span'])[1]"));
		
		TrackPhoneCall.click();
		
	}

}
//<span data-lines="1" data-truncate="0" class="m_ n_ si34 span">Track Phone Calls</span>