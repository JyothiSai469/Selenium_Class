/*QUESTION 7 --------- 
URL:https://www.facebook.com/  
[Enter Email or Phone and Password.] */
package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Jyothisai469@gmail.com");
		
		WebElement pass = driver.findElement(By.id("pass"));
		
		pass.sendKeys("123654789");
		
	}

}
