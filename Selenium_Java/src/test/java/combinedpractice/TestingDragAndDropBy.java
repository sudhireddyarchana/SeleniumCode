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

public class TestingDragAndDropBy {
	public static void main(String[] args) throws Exception
	{
		//open browser, launch site and close banner 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		 FluentWait<RemoteWebDriver> wait= new FluentWait<RemoteWebDriver>(driver);
		 wait.withTimeout(Duration.ofSeconds(25));
		 wait.pollingEvery(Duration.ofMillis(1000));
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider");
		WebElement f= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(f));
		Actions act = new Actions(driver);
		WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='slider']/child::span")));
		act.dragAndDropBy(e, 200, 0).build().perform();
		Thread.sleep(5000);
		act.dragAndDropBy(e, -100, 0).build().perform();
		Thread.sleep(5000);
}
}