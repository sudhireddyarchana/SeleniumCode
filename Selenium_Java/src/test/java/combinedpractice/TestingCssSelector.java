package combinedpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingCssSelector {

	public static void main(String[] args) throws Exception
	{
		//open browser, launch site and close banner 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		 FluentWait<RemoteWebDriver> wait= new FluentWait<RemoteWebDriver>(driver);
		 wait.withTimeout(Duration.ofSeconds(25));
		 wait.pollingEvery(Duration.ofMillis(1000));
		driver.manage().window().maximize();
		driver.get("chrome://settings/");
		driver.findElement(By.cssSelector("settings-ui")).getShadowRoot().findElement(By.cssSelector("#toolbar"))
				.getShadowRoot().findElement(By.cssSelector("#search"))
                .getShadowRoot().findElement(By.cssSelector("#searchInput")).sendKeys("abdul kalam");  
		Thread.sleep(5000);
}
}