package Intermediate_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
      
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ritu Gautam\\Downloads\\chromedriver_win32_90\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		//driver.findElement(By.linkText("YES Bank Ltd.")).click();
		
		//*[@id="leftcontainer"]/table/tbody/tr[1]/td[1]/a
		
		
		String before_xpath = "//*[@id=\"leftcontainer\"]/table/tbody/tr[";
		String after_xpath = "]/td[1]/a" ;
		
		//method1 : for loop
//		for(int i=1;i<=26;i++) {
//			String name = driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
//			if(name.contains("ICICI Pru Life")){
//				driver.findElement(By.xpath(before_xpath+i+after_xpath)).click();
//			}
//		}

		
		// method 2: single line
	//	driver.findElement(By.xpath("//a[contains(text(),'ICICI Pru Life')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'ICICI Pru Life')]")).click();

	}

}
