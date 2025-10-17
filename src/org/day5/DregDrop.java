/*QUESTION 5: --------- 
URL:http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html 
[ Drag the capitals to its countries ] */
package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DregDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Thread.sleep(3000);
		WebElement boxG1 = driver.findElement(By.id("box1"));
		WebElement boxD1 = driver.findElement(By.id("box101"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(boxG1, boxD1).perform();
		
		Thread.sleep(1000);
		WebElement boxG2 = driver.findElement(By.id("box2"));
		WebElement boxD2 = driver.findElement(By.id("box102"));
		a.dragAndDrop(boxG2, boxD2).perform();
		
		Thread.sleep(1000);
		WebElement boxG3 = driver.findElement(By.id("box3"));
		WebElement boxD3 = driver.findElement(By.id("box103"));
		a.dragAndDrop(boxG3, boxD3).perform();
		
		Thread.sleep(1000);
		WebElement boxG4 = driver.findElement(By.id("box4"));
		WebElement boxD4 = driver.findElement(By.id("box104"));
		a.dragAndDrop(boxG4, boxD4).perform();
		
		Thread.sleep(1000);
		WebElement boxG5 = driver.findElement(By.id("box5"));
		WebElement boxD5 = driver.findElement(By.id("box105"));
		a.dragAndDrop(boxG5, boxD5).perform();
		
		Thread.sleep(1000);
		WebElement boxG6 = driver.findElement(By.id("box6"));
		WebElement boxD6 = driver.findElement(By.id("box106"));
		a.dragAndDrop(boxG6, boxD6).perform();
		
		Thread.sleep(1000);
		WebElement boxG7 = driver.findElement(By.id("box7"));
		WebElement boxD7 = driver.findElement(By.id("box107"));
		a.dragAndDrop(boxG7, boxD7).perform();
		
	}
}
