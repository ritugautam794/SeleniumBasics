package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle7_findElements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ritu Gautam\\Downloads\\chromedriver_win32_90\\chromedriver.exe");

		// System.setProperty("webdriver.chrome.verboseLogging", "true");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		// 1. Get total count of all the links on the page
		// 2. Get the text of each link
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("No of links"+list.size());
		
		for(WebElement s: list) {
			System.out.println(s.getText());
		}

	}

}
