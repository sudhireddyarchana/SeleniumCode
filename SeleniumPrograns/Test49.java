package tests;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test49
{
	public static void main(String[] args) throws Exception
	{
		//Open browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver(); 
		//Launch site using base URL
		driver.get("https://www.google.co.in");
		Thread.sleep(5000); 
		//collect logs
		Set<String> s=driver.manage().logs().getAvailableLogTypes();
		System.out.println(s);
		//Get browser logs
		System.out.println("Browser logs:");
		LogEntries bl=driver.manage().logs().get("browser");
		for(LogEntry l:bl)
		{
			System.out.println(l.getMessage());
		}
		//Get browser driver software logs
		System.out.println("Browser driver software logs:");
		LogEntries dl=driver.manage().logs().get("driver");
		for(LogEntry l:dl)
		{
			System.out.println(l.getMessage());
		}
		//Get client logs(OS, N/W, Memory and other resources)
		System.out.println("client logs:");
		LogEntries cl=driver.manage().logs().get("client");
		for(LogEntry l:cl)
		{
			System.out.println(l.getMessage());
		}
		driver.close();
	}
}
