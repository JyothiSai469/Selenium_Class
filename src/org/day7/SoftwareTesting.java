/*QUESTION 1 ----------- 
URL : https://en.wikipedia.org/wiki/Software_testing 
NOTE: Go to down of the webpage using scrolldown and print the line"Automated Testing" */
package org.day7;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SoftwareTesting {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/Software_testing");
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		
		WebElement Automated = driver.findElement(By.id("Automated_testing"));
		
		Thread.sleep(2000);
		j.executeScript("arguments[0].scrollIntoView(false)", Automated);
		
		Object id = j.executeScript("return arguments[0].getAttribute('id')", Automated);
		System.out.println(id);
		
	}

}
