package Intermediate_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements_VisibilityTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ritu Gautam\\Downloads\\chromedriver_win32_90\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://freecrm.com/");
		driver.findElement(By.xpath("//a[@title='register on freecrm.com']")).click();
		Thread.sleep(3000);
		
		boolean b = driver.findElement(By.name("action")).isDisplayed();  //true
		boolean b1 = driver.findElement(By.name("action")).isEnabled();  //true
		boolean b3 = driver.findElement(By.id("terms")).isSelected();   //false
		
		driver.findElement(By.id("terms")).click();
		boolean b4 = driver.findElement(By.id("terms")).isSelected();   //true
		
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b3);
		System.out.println(b4);
		
		
		
	}

}
