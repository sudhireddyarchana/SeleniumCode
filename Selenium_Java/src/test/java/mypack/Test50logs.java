package mypack;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test50logs {
	public static void main(String[] args)throws Exception {
		//open chrome browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.magnitia.com");
		Set<String> s=driver.manage().logs().getAvailableLogTypes();
		System.out.println(s);
		//get browser logs
		LogEntries bl=driver.manage().logs().get("browser");
		System.out.println("browser logs:");
		for(LogEntry l:bl)
		{
		System.out.println(l.getMessage());
		}
		//driver logs
		LogEntries dl=driver.manage().logs().get("driver");
		System.out.println("driver logs:");
		for(LogEntry l:dl)
		{
		System.out.println(l.getMessage());
		}
		//client logs(os,N/W...)
		LogEntries cl=driver.manage().logs().get("client");
		System.out.println("client logs");
		for(LogEntry l:cl)
		{
		System.out.println(l.getMessage());
		}
		
		driver.close();
}
}