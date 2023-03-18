package mypack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test69Select {

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
		driver.get("http://www.amazon.in");
		//locate an operate element
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-search-dropdown-card")));
		WebElement e= driver.findElement(By.id("searchDropdownBox"));
		Select s=new Select(e);
		//testcase-1:check the drop down is single sel or multi select
		if(s.isMultiple())
		{
			System.out.println("multi selected dropdown");
		}
		else {
			System.out.println("single select dropdown");
		}
	    //testcase-2:select all items in a dropdown
		List<WebElement> items=s.getOptions();
		System.out.println("count of items is:"+items.size());
		for(WebElement item:items)
		{
			System.out.println(item.getText());
		}
		//testcase-3: select items by index,text,value
		s.selectByIndex(1);
		Thread.sleep(5000);
		s.selectByVisibleText("Baby");
		Thread.sleep(4000);
		s.selectByValue("search-alias=fashion");
		Thread.sleep(4000);
		driver.close();
		

	}

}
