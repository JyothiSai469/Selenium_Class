/*UESTION 9: ---------- 
URL:https://www.f6s.com/companies/e-commerce/india/tamil-nadu/chennai/co-----> 
Print the paragraph 
starts from Desihands.... */
package org.day4;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Ecommerce {
	
	

	    public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.f6s.com/companies/e-commerce/india/tamil-nadu/chennai/co");

	        Thread.sleep(3000);
	        
	        WebElement checkbox = driver.findElement(By.id("checkbox"));
	        checkbox.click();

	 

	        
	    }
	}



