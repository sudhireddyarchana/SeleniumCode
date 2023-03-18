package combinedpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testingpause {
	public static void main(String[] args) throws Exception
	{
		//open browser, launch site and close banner 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		 FluentWait<RemoteWebDriver> wait= new FluentWait<RemoteWebDriver>(driver);
		 wait.withTimeout(Duration.ofSeconds(25));
		 wait.pollingEvery(Duration.ofMillis(1000));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='Login'])[1]/preceding::button[1]"))).click();
		WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Beauty']")));
		Actions act= new Actions(driver);
		act.moveToElement(e).pause(10000).click().perform();
		Thread.sleep(5000);
}
}