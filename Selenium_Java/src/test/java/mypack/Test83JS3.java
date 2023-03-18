package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test83JS3 
{
	public static void main(String[] args)throws Exception 
	{
			WebDriverManager.chromedriver().setup();
			RemoteWebDriver driver=new ChromeDriver();
			//launch site
			driver.get("https://www.google.com");
			Thread.sleep(4000);
			WebElement e=driver.findElement(By.name("q"));
			//background color to pink
			driver.executeScript("arguments[0].style.background='pink';", e);
			Thread.sleep(4000);
			//text color to blue
			driver.executeScript("arguments[0].style.color='blue';", e);
			driver.executeScript("arguments[0].value='Ram charan';", e);
			Thread.sleep(4000);
			//highlight that element with solid line with red
			driver.executeScript("arguments[0].style.border='5px black solid';", e);
			Thread.sleep(4000);
			//close
			driver.close();
			

	}
}
