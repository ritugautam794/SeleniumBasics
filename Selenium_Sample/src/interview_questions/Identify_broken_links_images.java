package interview_questions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Identify_broken_links_images {

	public static void main(String[] args) throws MalformedURLException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ritu Gautam\\Downloads\\chromedriver_win32_90\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.amazon.com/");

		List<WebElement> LinkList = driver.findElements(By.tagName("a"));
		List<WebElement> ImgList = driver.findElements(By.tagName("img"));

		List<WebElement> ActiveLinksList = new ArrayList<WebElement>();

		System.out.println("Total no of links: " + LinkList.size());
		System.out.println("Total no of Img links: " + ImgList.size());

		LinkList.addAll(ImgList);

		System.out.println("Total no of all the links: " + LinkList.size());

		//&& (!LinkList.get(i).getAttribute("href").contains("javascript")
		//mailto:?subject=Homemade%20Sushi%20%28with%20brown%20rice%29&body=https%3A%2F%2Fwww.100daysofrealfood.com%2Frecipe-homemade-sushi%2F
		//(LinkList.get(i).toString().startsWith("http")
		for (int i = 0; i < LinkList.size(); i++) {
			
			System.out.println(i + ":" + LinkList.get(i).getAttribute("href"));
			
			if ((LinkList.get(i).getAttribute("href") != null)) {
				
				ActiveLinksList.add(LinkList.get(i));
			}
		}
		
		System.out.println("Active list size: "+ActiveLinksList.size());
		
		/*
		 * 1. Get all the active links
		 * 2. Go to each URl and try pinging/ and get response
		 * 3. if response is 200/ok --> correct URL
		 *    else --->NOT OK url    
		 */
		
		for(int j=0; j<ActiveLinksList.size();j++ ) {
			
			HttpURLConnection connection = (HttpURLConnection) new URL(ActiveLinksList.get(j).getAttribute("href")).openConnection();
			
			try {
				connection.connect();
			} catch (IOException e) {
				e.printStackTrace();
			}
			String response = connection.getResponseMessage();
			connection.disconnect();	
			System.out.println(ActiveLinksList.get(j).getAttribute("href")+":-------->"+response);
		}

	}
}
