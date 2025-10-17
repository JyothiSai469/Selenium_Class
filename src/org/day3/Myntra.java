/*UESTION 7: --------- 
URL : https://www.myntra.com/register?referer=https://www.myntra.com/ ------------->Enter Mobile number 
and click continue */
package org.day3;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		
		WebElement cell = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		cell.sendKeys("1234567890");
		
		WebElement click =  driver.findElement(By.xpath("//input[@type='checkbox']"));
		click.click();
		
		WebElement button = driver.findElement(By.xpath("//div[text()='CONTINUE']"));
		button.click();
	}

}
//<input autocomplete="new-password" id type="tel" class="form-control mobileNumberInput" placeholder maxlength="10" value>