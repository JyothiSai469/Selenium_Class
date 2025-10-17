/*QUESTION 2: --------- 
URL:https://www.saucedemo.com/  
[Enter username and password and click Login] */
package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class saucedemo {
	 public static void main(String[] args) throws InterruptedException {
		
		 WebDriver drive = new ChromeDriver();
		 drive.get("https://www.saucedemo.com/");
		 
		 WebElement userName = drive.findElement(By.id("user-name"));
		 userName.sendKeys("standard_user");
		 
		WebElement pass = drive.findElement(By.id("password"));
		pass.sendKeys("secret_sauce");
		
		Thread.sleep(2000);
		
		WebElement button = drive.findElement(By.id("login-button"));
		button.click();
	}
}
//<input class="input_error form_input" placeholder="Username" type="text" data-test="username" id="user-name" name="user-name" autocorrect="off" autocapitalize="none" value>

//<input class="input_error form_input" placeholder="Password" type="password" data-test="password" id="password" name="password" autocorrect="off" autocapitalize="none" value>

//<input type="submit" class="submit-button btn_action" data-test="login-button" id="login-button" name="login-button" value="Login">