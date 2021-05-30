package Intermediate_Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_bootstrap_dropdowns {

	public static void main(String[] args) {
		// Select is not available in bootstrap menu..they are majorly links and buttons

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ritu Gautam\\Downloads\\chromedriver_win32_90\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		driver.findElement(By.xpath("//button[@type='button' and @id='dropdownMenuButton']")).click();
		List<WebElement> list = driver
				.findElements(By.xpath("//div[@class='dropdown-menu' and @aria-labelledby='dropdownMenuButton']//a"));
		List list2 = driver
				.findElements(By.xpath("//div[@class='dropdown-menu' and @aria-labelledby='dropdownMenuButton']//a"));
		// //div[@class='dropdown']//div[@aria-labelledby='dropdownMenuButton']/a
		// //div[@class='dropdown-menu' and @aria-labelledby='dropdownMenuButton']//a
		System.out.println(list.size());
		System.out.println(list2.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).equals("Another action")) {
				list.get(i).click();
				break;
			}
			System.out.println(list);
		}

	}

}
