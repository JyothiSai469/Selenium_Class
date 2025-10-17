package org.Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	
	public static void main(String[] args) {
		
		WebDriver driv = new ChromeDriver();
		driv.get("https://www.youtube.com/ ");
		
		String title = driv.getTitle();
		System.out.println(title);
		
		String url = driv.getCurrentUrl();
		System.out.println(url);
	}

}
