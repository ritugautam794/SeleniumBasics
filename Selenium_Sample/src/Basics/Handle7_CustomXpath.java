package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle7_CustomXpath {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ritu Gautam\\Downloads\\chromedriver_win32_90\\chromedriver.exe");

		// System.setProperty("webdriver.chrome.verboseLogging", "true");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		// xpath - absolute path not recommended
		/* 1. performance issue
		 * 2. not reliable
		 * 3. the value can change in future
		 * 
		 */
		
//		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("toys");
//		driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("toys");
//		driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("java");

		//dynamic id : starts with
		// id = test_123
		//id = test_675
		//id = test_653
		
		//ends_with
		//123_test_t
		//432_test_t
		
//		driver.findElement(By.xpath("//input[contains(@id,'test_123')]")).sendKeys("java");
//		driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("java");
//		driver.findElement(By.xpath("//input[ends-with(@id,'_test_t')]")).sendKeys("java");
		
		//links : 
		driver.findElement(By.xpath("//a[contains(text(),'Daily Deals')]")).click();
		
		/*1. //input[@class= 'xoxox' and @id = 'ahsgsg']
		 *2. //a[text()='features']    // for links 
		 *3. //a[contains(text(),'features')]
		 *4. 
		 *
		 *
		 *
		 *
		 * Buttons
		 * 1. //button[@type='button' and @class='btn']
		 * 2. //button[contains(text(),'Sign Up')
		 * 3. //div[@class='dropdown']//button[@type='button' and @class='btn btn-secondary dropdown-toggle' and @id='dropdownMenuButton']//button[@id='dropdownMenuButton']
		 * 
		 * 4. ++preceding-sibling:
		 *    //a[text()='test2 test2']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input
		 *    
		 *    ++parent & preceding-sibling:
        * 5.  //a[text()='test2 test2']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']
		
		*/
		
	}

}
