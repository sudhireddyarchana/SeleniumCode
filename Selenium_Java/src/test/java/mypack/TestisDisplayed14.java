package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestisDisplayed14 {

		public static void main(String[] args) throws Exception
		{
			//open browser
			WebDriverManager.chromedriver().setup();
			RemoteWebDriver driver=new ChromeDriver();
			//Launch site 
			driver.get("https://www.google.co.in");
			Thread.sleep(5000);
		WebElement e=driver.findElement(By.xpath("//input[@name='q']"));
		//test whether the element is present or not
		if(e.isDisplayed())
		{
			System.out.println("the element visible in the page");
			//checks whether that element showing or not
			if(e.isEnabled())
			{
			System.out.println("element is enabled(working)in the page");	
			}
			else
			{
			System.out.println("element is disabled in the page");
			}}
			else
			{
			System.out.println("element not visible on the page");
			}
		//close site
		driver.close();
		}
			
	}


