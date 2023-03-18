package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test75cssSelector {

	public static void main(String[] args)throws Exception {
	//Open browser
	WebDriverManager.chromedriver().setup(); 
	RemoteWebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//launch site
	driver.get("chrome://settings/");
	Thread.sleep(4000);
	//go to inside the shadow-root to locate and operate an element
	driver.findElement(By.cssSelector("settings-ui"))
          .getShadowRoot()
          .findElement(By.cssSelector("#toolbar"))
          .getShadowRoot()
          .findElement(By.cssSelector("#search"))
          .getShadowRoot()
          .findElement(By.cssSelector("#searchInput")).sendKeys("abdulkalam",Keys.ENTER);
	//close the site
	driver.close();
	}

}
