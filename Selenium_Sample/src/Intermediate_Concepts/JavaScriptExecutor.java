package Intermediate_Concepts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ritu Gautam\\Downloads\\chromedriver_win32_90\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
    	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://freecrm.com/");
		Thread.sleep(4000);
		
//		driver.switchTo().frame("intercom-frame");
		
//		driver.findElement(By.xpath("//span[@class='icon icon-xs mdi-chart-bar')]")).click();
//		driver.findElement(By.className("icon icon-xs mdi-chart-bar")).click();
//		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
//     	driver.findElement(By.className("btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left")).click();
//		driver.findElement(By.className("btn.btn-primary.btn-xs-2.btn-shadow.btn-rect.btn-icon.btn-icon-left")).click();
		
		WebElement signupbutton= driver.findElement(By.xpath("//a[@title='register on freecrm.com']"));
		WebElement restCRM = driver.findElement(By.linkText("Restaurant CRM"));
		
		flash(signupbutton, driver);
		
		drawBorder(signupbutton, driver);
		
		Thread.sleep(3000);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Ritu Gautam\\eclipse-workspace1\\Selenium_Sample\\src\\Intermediate_Concepts\\javascripteExecutor.png"));
	
		
//		generateAlert(driver, "This is a alert generate by javascript executor");
		
		clickElemByJS(signupbutton, driver);
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();// refresh by selenium
		refreshBrowserbyJS(driver); // refresh by javascript
		
		driver.navigate().back();

		Thread.sleep(3000);
		
		System.out.println(getTitlebyJS(driver));
		
		System.out.println(getInnerText(driver));
		
		//scrollPageDown(driver);
		
		scrollIntoView(restCRM, driver);
		
		
		
		
		
	}
	
	public static void flash(WebElement e, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String bgcolor = e.getCssValue("backgroundColor");
		for(int i =0;i<50;i++) {
			changeColor("rgb(255,0,255)",e, driver);
			changeColor(bgcolor,e, driver);
		}
	}
	
	public static void changeColor(String color, WebElement e, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.backgroundColor= '"+color+"'",e);
		
		try {
			Thread.sleep(20);
		}catch(InterruptedException e1) {		
			e1.printStackTrace();
		}
	}
	
	public static void drawBorder(WebElement e, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid red'",e);
		
	}
	
	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('"+message+"')");
	}

	public static void clickElemByJS(WebElement e, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",e);
	}
	
	public static void refreshBrowserbyJS(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go(0)");
	}
	
	public static String getTitlebyJS(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String s= js.executeScript("return document.title;").toString();
		return s;
	}
	
	public static String getInnerText(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String pagetext = js.executeScript("return document.documentElement.innerText;").toString();
		return pagetext;
	}
	
	public static void scrollPageDown (WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}
	
	public static void scrollIntoView(WebElement e ,WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true);",e);
		
	}
	
	
}
