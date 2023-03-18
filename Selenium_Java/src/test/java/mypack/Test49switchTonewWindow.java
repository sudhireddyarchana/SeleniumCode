package mypack;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test49switchTonewWindow {
	public static void main(String[] args)throws Exception {
		//open chrome browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		//create new window/tab
		driver.switchTo().newWindow(WindowType.TAB);
		//get window handles to switch to new tab
		Set<String> s=driver.getWindowHandles();
		List<String> l=new ArrayList<String>(s);
	   //switch to new window
		driver.switchTo().window(l.get(1));
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		//create a new tab
		driver.switchTo().newWindow(WindowType.TAB);
		//get handle ids
		 s=driver.getWindowHandles();
		 l=new ArrayList<String>(s);
		 driver.switchTo().window(l.get(2));
		 driver.get("https://www.yahoo.com");
		 Thread.sleep(5000);
		 //close all tabs
		 driver.quit();
			
		
		
}
}