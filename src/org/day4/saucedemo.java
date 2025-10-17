/*QUESTION 1: ---------- 
URL:https://www.saucedemo.com/inventory.html ------------>Click any product ,then add to the cart*/
package org.day4;


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
		
		WebElement clickk = drive.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		
		clickk.click();
		WebElement cart = drive.findElement(By.xpath("//a[@data-test='shopping-cart-link']"));
		cart.click();
		
		
	}
}

