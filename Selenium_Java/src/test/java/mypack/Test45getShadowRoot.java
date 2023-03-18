package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test45getShadowRoot {
   public static void main(String[] args)throws Exception {
			//open chrome browser
			WebDriverManager.chromedriver().setup();
			RemoteWebDriver driver=new ChromeDriver();
			//Launch site
			driver.get("https://shop.polymer-project.org/");
			Thread.sleep(3000);
       WebElement e= driver.findElement(By.xpath("//shop-app[@page='home']"));
       SearchContext t= e.getShadowRoot();
       t.findElement(By.linkText("Men's T-Shirts"))
         .click();
	}

}
