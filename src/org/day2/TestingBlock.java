/*QUESTION 8 --------- 
URL:https://only-testing-blog.blogspot.com/ 
[Fill the grand parent 1 and grand parent 2 details]*/
package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingBlock {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://only-testing-blog.blogspot.com/");
		// Grand Parent 1 Details.
		WebElement gparent1 = driver.findElement(By.id("gparent_1"));
		gparent1.sendKeys("Krishnaya");
		
		WebElement parent1 = driver.findElement(By.id("parent_1"));
		parent1.sendKeys("Ravi");
		
		WebElement child1 = driver.findElement(By.id("child_1"));
		child1.sendKeys("Jyothi Sai");
		
		// Grand Parent 2 Details.
		
		WebElement gparent2 = driver.findElement(By.id("gparent_2"));
		gparent2.sendKeys("Raj Gopal");
		
		WebElement parent2 = driver.findElement(By.id("parent_2"));
		parent2.sendKeys("Thulasi");
		
		WebElement child2 = driver.findElement(By.id("child_2"));
		child2.sendKeys("Puppy");
	}

}
