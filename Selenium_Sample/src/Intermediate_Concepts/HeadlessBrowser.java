package Intermediate_Concepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class HeadlessBrowser {

	public static void main(String[] args) throws InterruptedException  {
		
		/*
		 * 1. testing behind the scenes
		 * 2. without opening browser
		 * 3. fast performance
		 * 4. smoke or sanity kind of test
		 * 5. not suitable for heavy apps- mouse movement--drag and drop and double clicks
		 */
		
		/*
		 * Headless browser list
		 * 1. HTMLunitDriver()  -- java
		 * 2. PhantonJS() ---------javascript
		 * 3. GhostDriver()
		 */
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ritu Gautam\\Downloads\\chromedriver_win32_90\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
 //   	WebDriver driver = new HtmlUnitDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://freecrm.com/");
		
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@title = 'register on freecrm.com']")).click();
		
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.findElement(By.name("email")).sendKeys("rtiytgautam794@gmail.com");

	}

}
