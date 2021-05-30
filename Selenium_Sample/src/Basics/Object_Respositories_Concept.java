package Basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Object_Respositories_Concept {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
	
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\Ritu Gautam\\eclipse-workspace1\\Selenium_Sample\\src\\Basics\\config.properties");
		
		prop.load(ip);
		
		String register_url = prop.getProperty("URL");	
		String browserName = prop.getProperty("browser");
		
		System.out.println(register_url);
		System.out.println(browserName);
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Ritu Gautam\\Downloads\\chromedriver_win32_90\\chromedriver.exe");
		    driver = new ChromeDriver();
			
		}else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Ritu Gautam\\Downloads\\firefoxdriver_win32_90\\firefoxdriver.exe");
			driver = new FirefoxDriver();
			
		}else if(browserName.equals("internetexplorer")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Ritu Gautam\\Downloads\\internetexplorerdriver_win32_90\\internetexplorerdriver.exe");
			driver = new InternetExplorerDriver();
		
		}
		
		driver.get(register_url);
		driver.findElement(By.xpath(prop.getProperty("firsname_xpath"))).sendKeys("ritu");
		driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys("gautam");
		driver.findElement(By.xpath(prop.getProperty("email_xpath"))).sendKeys("abcrtgautam794@gmail.com");
		driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys("asd12339jsh");
		driver.findElement(By.xpath(prop.getProperty("registerbutton_xpath"))).click();
		

	}

}
