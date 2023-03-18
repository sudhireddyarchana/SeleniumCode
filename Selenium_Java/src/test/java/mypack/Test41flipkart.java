package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test41flipkart {

	public static void main(String[] args)throws Exception {
		//open chrome browser
			WebDriverManager.chromedriver().setup();
			RemoteWebDriver driver=new ChromeDriver();
			//Launch site
			driver.get("https://www.flipkart.com");
			Thread.sleep(5000);
			try
			{
			driver.findElement(By.xpath("(//span[text()='Login'])[1]/preceding::button[1]")).click();
			}
			catch(Exception ex)
			{
				System.out.println("no banner");
			}
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@alt='Appliances']")).click();
			Thread.sleep(4000);
			driver.close();
			
    

	}

}
