package mypack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test59gmail {

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
		driver.get("https://www.gmail.com");
		ExpectedCondition<Boolean> ec1=titleIs("Gmail");
		ExpectedCondition<Boolean> ec2=urlContains("https");
		wait.until(and(ec1,ec2));
		//do login
		wait.until(visibilityOfElementLocated(By.id("identifierId"))).sendKeys("seleniumpracticework@gmail.com");
		wait.until(elementToBeClickable(By.xpath("//span[text()='Next']"))).click();
		wait.until(visibilityOfElementLocated(By.xpath("//input[@name='Passwd']"))).sendKeys("bubby1828");
		wait.until(elementToBeClickable(By.xpath("//span[text()='Next']"))).click();
		wait.until(numberOfElementsToBe(By.xpath("(//table)[6]/tbody/tr"), 8));
		//click on compose
		wait.until(elementToBeClickable(By.xpath("//div[text()='Compose']"))).click();
		//fill fields
		wait.until(visibilityOfElementLocated(By.name("to")))
		                                        .sendKeys("archanareddysudineni@gmail.com");
		wait.until(visibilityOfElementLocated(By.name("subjectbox"))).sendKeys("project-work");
		wait.until(visibilityOfElementLocated(By.xpath("//div[@aria-label='Message Body']")))
		                                        .sendKeys("hi friends\nhow are you?");
		wait.until(elementToBeClickable(By.xpath("//div[text()='Send']"))).click();
		//sign out
		wait.until(elementToBeClickable(By.xpath("(//a[starts-with(@aria-label,'Google')])[2]")))
		                                         .click();
		try
		{
		wait.withTimeout(Duration.ofSeconds(10));
		wait.until(elementToBeClickable(By.xpath("//div[text()='Sign out'])"))).click();
		}
		catch(Exception ex)
		{
		wait.withTimeout(Duration.ofSeconds(20));	
		wait.until(frameToBeAvailableAndSwitchToIt(By.xpath("(//iframe[@role='presentation'])[2]")));
		wait.until(elementToBeClickable(By.xpath("//div[text()='Sign out']"))).click();	
	}
	}
	
	}


