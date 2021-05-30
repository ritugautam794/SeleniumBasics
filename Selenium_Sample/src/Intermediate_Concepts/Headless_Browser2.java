package Intermediate_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_Browser2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ritu Gautam\\Downloads\\chromedriver_win32_90\\chromedriver.exe");
		
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless", "--window-size=1400,800");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		WebDriver driver = new ChromeDriver(options);
		// WebDriver driver = new HtmlUnitDriver();

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
