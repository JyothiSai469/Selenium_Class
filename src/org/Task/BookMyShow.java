package org.Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BookMyShow {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
				
		driver.get("https://in.bookmyshow.com/");
	}

}
