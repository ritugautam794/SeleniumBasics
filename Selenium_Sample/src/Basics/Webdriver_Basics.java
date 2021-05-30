package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Basics {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ritu Gautam\\Downloads\\chromedriver_win32_90\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.verboseLogging", "true");
		WebDriver driver =	 new ChromeDriver(); //launch chrome
		driver.get("http://www.google.com/");         //enter url
		String title = driver.getTitle();
		
		System.out.println(title);
		
		if(title.equals("Google")) {   // validation
			System.out.println("correct tittle");
		}else {
			System.out.println("Incoorect title");
		}
		
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.close();



	}

}
