/*ESTION 6: --------- 
URL : https://www.facebook.com/ -----------> 
Pass the values to email and pwd.Print the user Inputs*/
package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("jyothisai@gmail.com");
		
		System.out.println("Entered Email Id: "+ email.getAttribute("value"));
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("123654789");
		
		System.out.println("Entered Password: "+ pass.getAttribute("value"));
		
//		String password = pass.getAttribute("placeholder");
//		System.out.println(password);
//		
				
	}

}
