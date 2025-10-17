/*QUESTION 1: --------- 
URL : https://www.flipkart.com/ 
[Click Login and Entere Username password ] */
package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.xpath("//span[text()='Login']"));
		
		login.click();
		
		WebElement email = driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']"));
		email.sendKeys("jyothisai@gmail.com");
	}

}
