package mypack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test57until {
	public static void main(String[] args)
	{
		//open chrome browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//define wait object
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(25));
		wait.pollingEvery(Duration.ofMillis(1000));
		//launch site
		driver.get("https://www.facebook.com");
		//do login
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")))
		                                                        .sendKeys("Archana");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")))
                                                                .sendKeys("sudineni");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("login"))).submit();
}                                                               
}
