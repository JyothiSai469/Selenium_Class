/*QUESTION 10 --------- 
URL:http://adactinhotelapp.com/ 
[Enter Email or Phone and Password] */
package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class adactinhotelapp {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		
		 WebElement userName = driver.findElement(By.id("username"));
		 userName.sendKeys("jyothisai469@gmail.com");
		 
		 WebElement pass = driver.findElement(By.id("password"));
		 pass.sendKeys("12365479djkbds");
	}

}
//<input type="text" name="username" id="username" class="login_input" value>
//<input type="password" name="password" id="password" class="login_input" value>