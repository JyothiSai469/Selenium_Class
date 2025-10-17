/*QUESTION 5: -------- 
URL:https://demo.applitools.com/ 
--->Enter the username and password */
package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormLogin {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.applitools.com/");
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("JyothiSai");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("1234567890ph");		
	}

}
