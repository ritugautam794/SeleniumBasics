package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	/*7 types of locators
	 * 
	 */

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ritu Gautam\\Downloads\\chromedriver_win32_90\\chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.verboseLogging", "true");
		
		WebDriver driver =	 new ChromeDriver(); 
		
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");    
		
		//1. ID
		
//		driver.findElement(By.id("firstname")).sendKeys("Ritu");
//		driver.findElement(By.id("lastname")).sendKeys("Gautam");
		
		
		//2 XPATH -
		// Absolute xpath - not recommended
		// relative xpath - good
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Ritu");
		driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Ritu");
		
		//3. name 
		driver.findElement(By.name("firstname")).sendKeys("ritu");
		driver.findElement(By.name("lastname")).sendKeys("gautam");
		
		//4. linkText()
		driver.findElement(By.linkText("sign in")).click();
		
		//5. partial linktext() ---not useful
		//link - "how to create username"
		driver.findElement(By.partialLinkText("how to create")).click();
		
		//6. CSS Selectors
		// id ---------> #{id}
		// classname---> .{class}
		driver.findElement(By.cssSelector("#firstname")).sendKeys("ritu");
		
		//7. class name----not useful
		driver.findElement(By.className("abcd"));
		
		
		

	}

}
