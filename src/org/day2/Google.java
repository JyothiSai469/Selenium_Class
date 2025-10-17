/*QUESTION 9 ---------- 
URL:https://www.google.com/ 
[Enter  Selenium Web driver] */
package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement  search = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		search.sendKeys("Selenium Web driver");
		Thread.sleep(3000);
		search.click();
	}

}
//<textarea class="gLFyf" aria-controls="Alh6id" aria-owns="Alh6id" autofocus title="Search" value aria-label="Search" placeholder aria-autocomplete="both" aria-expanded="false" aria-haspopup="false" autocapitalize="off" autocomplete="off" autocorrect="off" id="APjFqb" maxlength="2048" name="q" role="combobox" rows="1" spellcheck="false" jsaction="paste:puy29d" data-ved="0ahUKEwjuhOqDh8aNAxXaUPUHHcopNyAQ39UDCAM"></textarea>flex