package Basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Alerts_Popups {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ritu Gautam\\Downloads\\chromedriver_win32_90\\chromedriver.exe");

		// System.setProperty("webdriver.chrome.verboseLogging", "true");

		WebDriver driver = new ChromeDriver();

		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.findElement(By.id("Register")).click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		// alert.dismiss();

	}

}
