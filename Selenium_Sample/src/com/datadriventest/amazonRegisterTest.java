package com.datadriventest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class amazonRegisterTest {
	WebDriver driver;

	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ritu Gautam\\Downloads\\chromedriver_win32_90\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(
				"https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&prevRID=M7S3CDAK35JWJ5654C35&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

	}
	
	
	@Test
	public void registeronAmazon(String name, String mobile, String email, String password) {
		
		driver.findElement(By.xpath("//*[@id='ap_customer_name']")).clear();
		driver.findElement(By.xpath("//*[@id='ap_customer_name']")).sendKeys(name);

		driver.findElement(By.xpath("//*[@id='ap_phone_number']")).clear();
		driver.findElement(By.xpath("//*[@id='ap_phone_number']")).sendKeys(mobile);

		driver.findElement(By.xpath("//*[@id='ap_email']")).clear();
		driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys(email);

		driver.findElement(By.xpath("//*[@id='ap_password']")).clear();
		driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys(password);

		driver.findElement(By.xpath("//*[@id='continue']")).click();

	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
