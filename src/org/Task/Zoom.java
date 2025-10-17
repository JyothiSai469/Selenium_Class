package org.Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zoom {

	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		d.get("https://zoom.us/");
		
		String t = d.getTitle();
		System.out.println(t);
		
		String url = d.getCurrentUrl();
		System.out.println(url);
	}
}
