/*QUESTION 3 ---------- 
URL:https://www.saucedemo.com/ 
[Enter the username as Raja and password as 123456]*/
package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class saucedemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		 WebElement UserName = driver.findElement(By.id("user-name"));
		 UserName.sendKeys("Raja");
		 
		 WebElement userPass = driver.findElement(By.id("password"));
		 userPass.sendKeys("123456");
		
		
		
	}
}
