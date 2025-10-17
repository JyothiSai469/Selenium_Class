/*QUESTION 11 ---------- 
URL:https://www.selenium.dev/documentation/webdriver/elements/locators/ 
[Click about] */
package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebClick {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/webdriver/elements/locators/");
		
		WebElement about= driver.findElement(By.id("navbarDropdown"));
		about.click();
		
		
	}

}
//<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">…</a>