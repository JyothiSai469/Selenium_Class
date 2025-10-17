package org.Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class snapdeal {

	public static void main(String[] args) {
		
		WebDriver dri = new EdgeDriver();
		dri.get("https://www.snapdeal.com/");
	}
}
