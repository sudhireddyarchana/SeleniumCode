package mypack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test70select {

	public static void main(String[] args)throws Exception {

		//Open browser
		WebDriverManager.chromedriver().setup(); 
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//define wait object
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(1000));
		//launch site
		driver.get(
		  "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		//Locate and operate <select> tag drop down
		wait.until(frameToBeAvailableAndSwitchToIt(By.name("iframeResult")));
		WebElement e=wait.until(visibilityOfElementLocated(By.id("cars")));
		Select s= new Select(e);
		//test case-1:check single selected or multi selected
		if(s.isMultiple())
		{
			System.out.println("multi selected dropdown");
		}else {
			System.out.println("single selected dropdown");
		}
		//test case-2:get all items in a drop down
		List<WebElement> items=s.getOptions();
		System.out.println("count of an items:"+items.size());
		for(WebElement item:items)
		{
			System.out.println(item.getText());
		}
		//test case-3:select multiple items by using Actions class methods
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click(s.getOptions().get(1))//2
		                         .click(s.getOptions().get(0))//1
                                 .click(s.getOptions().get(3))//4
                                 .keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
		List<WebElement> sitems=s.getAllSelectedOptions();
		for(WebElement item:sitems)
		{
			System.out.println(item.getText());
		}
		WebElement fs=s.getFirstSelectedOption();
		System.out.println(fs);
		//test case-4: deselect items by using index,text,value
		s.deselectByIndex(1);
		Thread.sleep(5000);
		s.deselectByVisibleText("Audi");
		Thread.sleep(5000);
		s.deselectByValue("volvo");
		Thread.sleep(5000);
		s.deselectAll();
		driver.close();
	}

}
