package mypack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test58wait {

	public static void main(String[] args)
	{
		//open chrome browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//launch
		driver.get("http://dev.worke.io/register");
		//define wait object
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(25));
		wait.pollingEvery(Duration.ofMillis(1000));
		wait.until(urlContains("https"));
		//fill details
		wait.until(visibilityOfElementLocated(By.id("first_name"))).sendKeys("archana");
		wait.until(visibilityOfElementLocated(By.id("last_name"))).sendKeys("sudineni");
		wait.until(visibilityOfElementLocated(By.id("useremail"))).sendKeys("sudhineniarchana@gmail.com");
		wait.until(visibilityOfElementLocated(By.id("phone_number"))).sendKeys("6504563894");
		wait.until(visibilityOfElementLocated(By.id("userpassword"))).sendKeys("bubby");
		wait.until(visibilityOfElementLocated(By.xpath("(//input[@type='text'])[3]"))).sendKeys("student.worke.io");
		wait.until(elementToBeClickable(By.xpath("//button[text()='Register']"))).submit();
	}

}
