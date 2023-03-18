package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test31sendKeys {
	public static void main(String[] args) throws Exception
	{
		//open browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//Launch site 
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000); 
		//element covered by other element like banner
		//but sendKeys() is working successfully
		driver.findElement(By.name("q")).sendKeys("mobiles");
		Thread.sleep(5000); 
}
}
