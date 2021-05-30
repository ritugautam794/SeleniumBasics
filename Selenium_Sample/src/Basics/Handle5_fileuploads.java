package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle5_fileuploads {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ritu Gautam\\Downloads\\chromedriver_win32_90\\chromedriver.exe");

		// System.setProperty("webdriver.chrome.verboseLogging", "true");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		driver.findElement(By.id("myFile")).sendKeys("C:\\Users\\Ritu Gautam\\Downloads\\DNPaul_Resume.pdf");
		
		Thread.sleep(5000);
		
		

	}

}
