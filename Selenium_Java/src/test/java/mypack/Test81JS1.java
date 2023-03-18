package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test81JS1
{
	public static void main(String[] args)throws Exception 
	{
			WebDriverManager.chromedriver().setup();
			RemoteWebDriver driver=new ChromeDriver();
			//launch site
			driver.get("https://www.google.com");
			Thread.sleep(4000);
			//way-1:both locate and operate using js
			driver.executeScript("document.getElementsByName('q')[0].click();");
			//way-2:locate element by using swd and operate using js
			WebElement e=driver.findElement(By.name("q"));
			driver.executeScript("arguments[0].click();", e);


	}

}
