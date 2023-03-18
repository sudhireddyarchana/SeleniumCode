package mypack;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test62waotOR {

	public static void main(String[] args) {
		//open chrome browser
				WebDriverManager.chromedriver().setup();
				RemoteWebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				//define wait object
				FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
				wait.withTimeout(Duration.ofSeconds(25));
				wait.pollingEvery(Duration.ofMillis(1000));
				//launch site
				driver.get("https://www.google.co.in");
				ExpectedCondition<WebElement> ec1=elementToBeClickable(By.name("q"));
				ExpectedCondition<WebElement> ec2=elementToBeClickable(By.linkText("Gmail"));
				wait.until(or(ec1,ec2));
				//close site
				driver.close();

	}

}
