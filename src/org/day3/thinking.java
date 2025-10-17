/*QUESTION 4: ---------- 
URL:https://thinking-tester-contact-list.herokuapp.com/ 
[Click here--->Then] */
package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class thinking {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		
		WebElement here = driver.findElement(By.xpath("//a[text()='here']"));
		here.click();
	}

}
