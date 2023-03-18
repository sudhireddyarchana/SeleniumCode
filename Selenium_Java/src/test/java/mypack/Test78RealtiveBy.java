package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test78RealtiveBy 
{
	public static void main(String[] args)throws Exception {
		//open chrome browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		//locate and operate user id by using password
		WebElement e=driver.findElement(By.name("pass"));
		RelativeBy rb=RelativeLocator.with(By.tagName("input"));
		driver.findElement(rb.above(e)).sendKeys("6301894398");
}
}