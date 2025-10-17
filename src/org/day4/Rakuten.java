/*QUESTION 10: ----------- 
URL:https://www.rakuten.com/  ------------> 
Print Stack Cash Back on top of holiday sales*/
package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rakuten {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rakuten.com/");
		
		WebElement print = driver.findElement(By.xpath("//span[@class='css-d8mz0a']"));
		
		String p = print.getText();
		System.out.println(p);
		
		
		//System.out.println(print.getText());
	}

}
