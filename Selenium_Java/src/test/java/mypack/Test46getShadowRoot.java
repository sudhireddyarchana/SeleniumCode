package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test46getShadowRoot {
	 public static void main(String[] args)throws Exception {
			//open chrome browser
			WebDriverManager.chromedriver().setup();
			RemoteWebDriver driver=new ChromeDriver();
			//Launch site
			driver.get("chrome://settings/");
			Thread.sleep(5000);
			driver.findElement(By.tagName("settings-ui")).getShadowRoot()
                  .findElement(By.id("toolbar")).getShadowRoot()
                  .findElement(By.id("search")).getShadowRoot()
                  .findElement(By.id("searchInput")).sendKeys("sandeep unnikrishnan");
			Thread.sleep(5000);
}
	 
}