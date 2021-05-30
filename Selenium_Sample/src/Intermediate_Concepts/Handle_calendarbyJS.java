package Intermediate_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_calendarbyJS {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ritu Gautam\\Downloads\\chromedriver_win32_90\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.spicejet.com/");
		WebElement element = driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
		//element.click();
		String date = "30/12/2021";
		CalendarPickerbyJS(driver, element, date);
		System.out.println("done");
		
		System.out.println(element.getAttribute("value"));

	}
	
	public static void CalendarPickerbyJS(WebDriver driver, WebElement element, String date) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','"+date+"');", element);
	}

}
