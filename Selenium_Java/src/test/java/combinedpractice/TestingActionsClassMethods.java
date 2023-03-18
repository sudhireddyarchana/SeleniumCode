package combinedpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingActionsClassMethods {

	public static void main(String[] args) {
	 WebDriverManager.chromedriver().setup();
	 RemoteWebDriver driver= new ChromeDriver();
	 FluentWait<RemoteWebDriver> wait= new FluentWait<RemoteWebDriver>(driver);
	 wait.withTimeout(Duration.ofSeconds(25));
	 wait.pollingEvery(Duration.ofMillis(1000));
	 //launch site
	 driver.get("https://www.google.com");
	 Actions act =new Actions(driver);
	 WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
	 //act.contextClick(e).perform();
	 act.sendKeys(e,"kalam sir", Keys.ENTER).perform();
	 

	}

}
