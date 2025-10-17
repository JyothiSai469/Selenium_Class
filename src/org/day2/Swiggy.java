/*QUESTION 1: ---------- 
URL:https://www.swiggy.com/ 
[Enter any location] */

package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	
	public static void main(String[] args) {
		 
		WebDriver dri = new ChromeDriver();
		
		dri.get("https://www.swiggy.com/restaurants");
		
	 WebElement	other = dri.findElement(By.className("_1wAM-"));
		other.click();
		WebElement userName = dri.findElement(By.xpath("//input[@placeholder='Search for area, street name..']"));
		userName.sendKeys("SriKalahasti");
	}


}
//<span class="_1wAM-">Other</span>

//<input class="_5ZhdF _3GoNS itiW2" type="text" name placeholder="Search for area, street name.." value="I">