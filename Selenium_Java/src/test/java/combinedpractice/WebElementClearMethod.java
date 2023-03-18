package combinedpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementClearMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		    RemoteWebDriver driver =new ChromeDriver();
		    driver.get("https://www.google.com");
		   WebElement e= driver.findElement(By.name("q"));
		   e.sendKeys("abdul kalam sir",Keys.ENTER);
		   Thread.sleep(5000);
		  e= driver.findElement(By.name("q"));
		   e.clear();
		   Thread.sleep(5000);

	}

}
