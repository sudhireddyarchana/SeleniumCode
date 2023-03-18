package combinedpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementfindElements {

	public static void main(String[] args) throws Exception {
		 WebDriverManager.chromedriver().setup();
		 RemoteWebDriver driver =new ChromeDriver();
		 driver.get("https://shop.polymer-project.org/");
		 driver.findElement(By.tagName("shop-home")).getShadowRoot().findElement(By.linkText("Men's T-Shirts Shop Now"));
		 Thread.sleep(5000);
		
	}

}
