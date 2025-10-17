/*QUESTION 5 ---------- 
URL:https://www.snapdeal.com/login 
[Enter mobile number/email.] */
package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/login ");
		
		
	   WebElement number = driver.findElement(By.id("userName"));
	   number.sendKeys("7702012469");
	}

}
//<input class="col-xs-24" type="text" placeholder="Mobile Number/ Email" data-ismobileonly="false" name="username" id="userName">