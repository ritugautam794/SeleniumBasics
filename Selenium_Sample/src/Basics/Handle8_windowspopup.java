package Basics;



import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle8_windowspopup {
	/*
	 * 1. alerts-javascript - alert acceppt/dismiss
	 * 2. file uploads  type= file - .sendkeys(path)
	 * 3. browser window popups  - getwindowahandles()
	 * 4. ads pops
	 */

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ritu Gautam\\Downloads\\chromedriver_win32_90\\chromedriver.exe");

		// System.setProperty("webdriver.chrome.verboseLogging", "true");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://demo.guru99.com/popup.php");
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		String parentWinHandle = it.next();
		System.out.println("parent handle: "+ parentWinHandle);
		
		String childWinHandle = it.next();
		System.out.println("child handle: "+childWinHandle);
		
		driver.switchTo().window(childWinHandle);
		Thread.sleep(5000);
		System.out.println("child window title: "+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWinHandle);
		Thread.sleep(5000);
		System.out.println("parent window title: "+driver.getTitle());
		driver.close();
		
		
		
		
		
		
		
	}

}
