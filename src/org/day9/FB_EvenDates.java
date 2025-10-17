/*QUESTION 5
-----------
URL : https://www.facebook.com/
NOTE: print the even dates
*/
package org.day9;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_EvenDates {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement create = driver.findElement(By.xpath("//a[text()='Create new account']"));
		create.click();
		WebElement day = driver.findElement(By.id("day"));
	
		Select s =new Select(day);
				List<WebElement> op = s.getOptions();
		
				for (int i = 0; i < op.size(); i++) {
					if ((i+1) % 2==0) {
						String dd = op.get(i).getAttribute("value");
						System.out.println(dd);
					}
					
				}
				Thread.sleep(4000);
				driver.quit();
}

}
