/*QUESTION 4 ---------- 
URL:https://opensource-demo.orangehrmlive.com/web/index.php/auth/login 

[Enter the username as Admin and password as Admin123]*/
package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrmlive {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);

		 WebElement userName = Driver.findElement(By.xpath("//input[@placeholder='Username']")); 
		 userName.sendKeys("Admin");
		 
		WebElement pass = Driver.findElement(By.name("password"));
		pass.sendKeys("Admin123");
		
		
	}

}

//<input data-v-1f99f73c class="oxd-input oxd-input--active" name="username" placeholder="Username" autofocus>

//<input data-v-1f99f73c class="oxd-input oxd-input--active" type="password" name="password" placeholder="Password">