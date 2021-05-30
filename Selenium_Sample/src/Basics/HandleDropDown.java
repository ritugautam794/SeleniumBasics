package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ritu Gautam\\Downloads\\chromedriver_win32_90\\chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.verboseLogging", "true");
		
		WebDriver driver =	 new ChromeDriver(); 
		
		driver.get("https://github.com/settings/profile");  
		driver.findElement(By.id("login_field")).sendKeys("ritugautam794");
		driver.findElement(By.id("password")).sendKeys("12345rubai");
		driver.findElement(By.name("commit")).click();
		
		Select s = new Select(driver.findElement(By.id("user_profile_email")));
		s.selectByVisibleText("rtgautam794@gmail.com");

	}

}
