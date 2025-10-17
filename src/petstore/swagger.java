/*QUESTION 3: ----------  
URL:https://petstore.swagger.io/  
[Click Authorize and pass client id] */
package petstore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swagger {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://petstore.swagger.io/");
		
		WebElement cookies = driver.findElement(By.xpath("(//button[text()='Allow all cookies'])[1]"));
		
		cookies.click();
		
		Thread.sleep(2000);
		
		WebElement aut = driver.findElement(By.xpath("//span[text()='Authorize']"));
		aut.click();
		Thread.sleep(2000);
		
		WebElement clintId = driver.findElement(By.id("client_id_implicit"));
		clintId.sendKeys("jyothi");
		
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("(//button[text()='Authorize'])[2]"));
		button.click();
		
	}

}
