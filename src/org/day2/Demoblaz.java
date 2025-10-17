/*QUESTION 2: --------- 
URL:https://www.demoblaze.com/  
[ Press the Login button and pass the username & password  ] */
package org.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblaz {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/  ");
		
		WebElement	login = driver.findElement(By.xpath("//a[@id='login2']"));
		login.click();
		
//	    try {
//            Thread.sleep(1000); // 1-second wait
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
	    
		WebElement userNmae= driver.findElement(By.xpath("//input[@id='loginusername']"));
		userNmae.sendKeys("Jyothi");
		
	}

}
