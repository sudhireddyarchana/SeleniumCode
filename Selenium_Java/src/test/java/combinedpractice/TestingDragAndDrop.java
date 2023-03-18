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

public class TestingDragAndDrop {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 RemoteWebDriver driver= new ChromeDriver();
		 FluentWait<RemoteWebDriver> wait= new FluentWait<RemoteWebDriver>(driver);
		 wait.withTimeout(Duration.ofSeconds(25));
		 wait.pollingEvery(Duration.ofMillis(1000));
		 //launch site
		 driver.get("https://jqueryui.com/droppable/");
		 Actions act =new Actions(driver);
		 WebElement f=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(f));
		 WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("draggable")));
		 WebElement e2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("droppable")));
		 driver.executeScript("arguments[0].scrollIntoView();",e1);
		 act.dragAndDrop(e1, e2).perform();
		 Thread.sleep(5000);
		
		 
	}

}
