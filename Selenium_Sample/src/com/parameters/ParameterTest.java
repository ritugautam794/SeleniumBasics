package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	WebDriver driver;
		
	@Test
	@Parameters({"url","email"})
	public void yahooLoginTest(String url, String email) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ritu Gautam\\Downloads\\chromedriver_win32_90\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		
		//driver.findElement(By.xpath("//input[@name='crumb']")).click();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();

		
	}

}
