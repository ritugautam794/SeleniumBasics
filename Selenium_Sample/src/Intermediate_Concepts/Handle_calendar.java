package Intermediate_Concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handle_calendar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ritu Gautam\\Downloads\\chromedriver_win32_90\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://ui.cogmento.com/");
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
		driver.findElement(By.name("email")).sendKeys("rtgautam794@gmail.com");
		driver.findElement(By.name("password")).sendKeys("12345Ritug");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click(); //login button
		driver.findElement(By.xpath("//div[@id='main-nav']//div//button[@class='ui mini basic icon button']")).click();
		//driver.switchTo().frame("mainpanel");
		
		String date = "32-May-2021";
		String dateArr[] = date.split("-"); // {18,September,2017}
		String day = dateArr[0];
		String month = dateArr[1];
		String year = dateArr[2];
		
		Select select = new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(month);
		
		Select select1 = new Select(driver.findElement(By.name("slctYear")));
		select1.selectByVisibleText(year);
		//*[@id="main-content"]/div/div[2]/div/div[2]/div/div[2]/div[2]
		

		//*[@id="main-content"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/div[6]/a
		//*[@id="main-content"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/div[7]/a
		//*[@id="main-content"]/div/div[2]/div/div[2]/div/div[2]/div[3]/div[2]/div/div[1]/a
		
		//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]
		//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]	
		//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[6]
		
		String beforeXpath = "//*[@id=\"main-content\"]/div/div[2]/div/div[2]/div/div[2]/div[";
		String afterXpath = "]/div[2]/div/div[";
		String xpathfinal = "]/a";
		
		final int totalWeekDays = 7;
		
		//2-1 2-2 2-3 2-4 2-5 2-6 2-7
		//3-2 3-2 3-3 3-4 3-5 3-6 3-7
		boolean flag = false;
		String dayVal = null;
		for(int rowNum=2; rowNum<=7; rowNum++){
			
			for(int colNum = 1; colNum<=totalWeekDays; colNum++){
				try{
			    dayVal =driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+xpathfinal)).getText();
				}catch (NoSuchElementException e){
					System.out.println("Please enter a correct date value");
					flag = false;
					break;
				}
				System.out.println(dayVal);
				if(dayVal.equals(day)){
					driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).click();
					flag = true;
					break;
				}				
			}
			if(flag){
				break;
			}
			
		}
	

	}

}
