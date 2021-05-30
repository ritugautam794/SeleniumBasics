package Intermediate_Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicGoogleSearch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ritu Gautam\\Downloads\\chromedriver_win32_90\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("java");
		///html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/ul/li[3]/div/div[2]/div[1]/span
		//descendant::div[@class='wM6W7d']//span
		List<WebElement> list= driver.findElements(By.xpath("//ul[@role='listbox']//li//div//descendant::div[@class='pcTkSc']"));
		
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("javascript")) {
				list.get(i).click();
				break;
			}
		}
		

	}

}
