package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handle8_ExplicitWait {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ritu Gautam\\Downloads\\chromedriver_win32_90\\chromedriver.exe");

		// System.setProperty("webdriver.chrome.verboseLogging", "true");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
//		driver.findElement(By.xpath("//input[contains(@id,'test_123')]")).sendKeys("java");
		
//		clickOn(driver, driver.findElement(By.xpath("//button[starts-with(@id,'u_0_d']")), 20);// not working
//		clickOn(driver, driver.findElement(By.xpath("//button[@name='login']")), 20);          //works good
//		clickOn(driver, driver.findElement(By.xpath("//button[starts-with(@id,\"u_0_d_\"]")), 20);
		
//		clickOn(driver, driver.findElement(By.xpath("//button[starts-with(@id, 'u_0_d_')]")), 20);  //works good
//		clickOn(driver, driver.findElement(By.xpath("//button[starts-with(@id, 'u_0_d_')]")), 20);  //working
		clickOn(driver, driver.findElement(By.xpath("//*[starts-with(@id, 'u_0_d_')]")), 20);  
		
		
		

	}
	
	public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
		new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}

}
